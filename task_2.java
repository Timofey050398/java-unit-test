@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", expected, isAdult);
}
@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(15);
    boolean expected = false;
    assertEquals("Должно вернуться false, так как пользователь не совершеннолетний", expected, isAdult);
}
@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    boolean expected = true;
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", expected, isAdult);
}