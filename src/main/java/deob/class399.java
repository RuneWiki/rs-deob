package deob;

@ObfuscatedName("pe")
public class class399 {

    @ObfuscatedName("pe.at")
    public int field4475;

    @ObfuscatedName("pe.an")
    public int field4472;

    @ObfuscatedName("pe.av")
    public int field4474;

    @ObfuscatedName("pe.as")
    public int field4473;

    public class399() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4475).length();
        int var3 = 10 - Integer.toString(this.field4474).length();
        int var4 = 10 - Integer.toString(this.field4472).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4475 + var5 + "Created: " + this.field4472 + var7 + "Total used: " + this.field4474 + var6 + "Max-In-Use: " + this.field4473;
    }
}
