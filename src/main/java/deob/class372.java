package deob;

@ObfuscatedName("nf")
public class class372 {

    @ObfuscatedName("nf.a")
    public int field4377;

    @ObfuscatedName("nf.f")
    public int field4374;

    @ObfuscatedName("nf.c")
    public int field4375;

    @ObfuscatedName("nf.x")
    public int field4376;

    public class372() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4377).length();
        int var3 = 10 - Integer.toString(this.field4375).length();
        int var4 = 10 - Integer.toString(this.field4374).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4377 + var5 + "Created: " + this.field4374 + var7 + "Total used: " + this.field4375 + var6 + "Max-In-Use: " + this.field4376;
    }
}
