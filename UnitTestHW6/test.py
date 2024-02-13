import pytest

from main import NumLists


@pytest.fixture
def list1():
    return [4, 8, 2, 0, 10, 34, 16]


@pytest.fixture
def list2():
    return [11, 0, 22, 50, 1, 7]


def test_num_lists(list1, list2):
    """ тест правильности инициализации класса """
    num_lst = NumLists(list1, list2)
    assert num_lst.lst1 == list1
    assert num_lst.lst2 == list2


@pytest.mark.parametrize("lst1, lst2, expected",
   [([4, 8, 2, 0, 10, 34, 16], [11, 0, 22, 50, 1, 7], (10.571428571428571, 15.166666666666666)),
   # ([4, 8, 2, 0, 10, 34, 16], [11, 0, 22, 50, 1, 7], (10.571428571428571, 15.16,
   # marks=pytest.mark.xfail)),
   ([4, 8, 2, 0, 10, 34, 16], [], (10.571428571428571, 0)),
   ([], [11, 0, 22, 50, 1, 7], (0, 15.166666666666666)),
   ([], [], (0, 0))])
def test_average_value_lists(lst1, lst2, expected):
    """ тест на прввильность средних значений при разных входных данных"""
    num_lst = NumLists(lst1, lst2)
    assert num_lst.average_value_lists() == expected


def test_first_average_more(list1, list2, capfd):
    """
    тест правильности вывода сообщения для варианта
    когда среднее значение 1го списка больше 2го
    """
    nums_list = NumLists(list2, list1)
    nums_list.compare_average_values()
    captured = capfd.readouterr()
    assert captured.out.strip() == "Первый список имеет большее среднее значение"


def test_second_average_more(list1, list2, capfd):
    """
    тест правильности вывода сообщения для варианта
    когда среднее значение 2го списка больше 1го
    """
    nums_list = NumLists(list1, list2)
    nums_list.compare_average_values()
    captured = capfd.readouterr()
    assert captured.out.strip() == "Второй список имеет большее среднее значение"


def test_equal_averages(list1, capfd):
    """
    тест правильности вывода сообщения для варианта
    когда среднее значение 1го и 2го списков равны
    """
    nums_list = NumLists(list1, list1)
    nums_list.compare_average_values()
    captured = capfd.readouterr()
    assert captured.out.strip() == "Средние значения равны"
