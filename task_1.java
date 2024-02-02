@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("Проверка что при передаче >18 лет возвращается true не пройдена",expected,isAdult);
}