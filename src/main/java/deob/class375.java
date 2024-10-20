package deob;

@ObfuscatedName("nk")
public class class375 {

    @ObfuscatedName("nk.h")
    public int field4428;

    @ObfuscatedName("nk.e")
    public int field4427;

    @ObfuscatedName("nk.v")
    public int field4429;

    @ObfuscatedName("nk.x")
    public int field4430;

    public class375() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4428).length();
        int var3 = 10 - Integer.toString(this.field4429).length();
        int var4 = 10 - Integer.toString(this.field4427).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4428 + var5 + "Created: " + this.field4427 + var7 + "Total used: " + this.field4429 + var6 + "Max-In-Use: " + this.field4430;
    }
}
