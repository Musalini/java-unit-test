@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean expected = true;
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Комментарий на случай провала теста",expected,isAdult);// Напиши код здесь
}
