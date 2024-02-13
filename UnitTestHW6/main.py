class NumLists:
    def __init__(self, lst1: list[int], lst2: list[int]):
        self.lst1 = lst1
        self.lst2 = lst2

    def average_value_lists(self) -> tuple[float, float]:
        """
        функция находит средние значения для элементов в списках lst1 и lst2
        :return: средние значения для списка lst1 и списка lst2
        """
        avl1 = 0
        avl2 = 0

        if self.lst1:
            avl1 = sum(self.lst1) / len(self.lst1)

        if self.lst2:
            avl2 = sum(self.lst2) / len(self.lst2)

        return avl1, avl2

    def compare_average_values(self) -> None:
        """
        функция сравнивает средние значения и выводит результат
        :return:
        """
        avl1, avl2 = self.average_value_lists()
        if avl1 > avl2:
            print('Первый список имеет большее среднее значение')
        elif avl1 < avl2:
            print('Второй список имеет большее среднее значение')
        else:
            print('Средние значения равны')


if __name__ == '__main__':
    ls1 = [1, 3, 6, 6, 9, 0]
    ls2 = [3, 7, 4, 9, 22, 11, 2]
    num_list = NumLists(ls1, ls2)
    num_list.compare_average_values()
