public void mainMethodTest() throws Exception{
    ByteArrayOutputStream data = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(data, true, "UTF-8");
    TestHelloWorld.doPrint(ps);
    ps.flush();
    Assert.assertEquals("Hello world") + System.getProperty("line.separator"), new String(data, "UTF-8"));
}
