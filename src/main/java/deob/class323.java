package deob;

@ObfuscatedName("la")
public class class323 {

    @ObfuscatedName("la.l")
    public int field3879;

    @ObfuscatedName("la.q")
    public int field3880;

    @ObfuscatedName("la.f")
    public int field3881;

    @ObfuscatedName("la.j")
    public int field3882;

    public class323() throws Throwable {
        throw new Error();
    }

    public String toString() {
        int var1 = 10 - Integer.toString(this.field3879).length();
        int var2 = 10 - Integer.toString(this.field3881).length();
        int var3 = 10 - Integer.toString(this.field3880).length();
        String var4 = "          ".substring(10 - var1);
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        return "    Size: " + this.field3879 + var4 + "Created: " + this.field3880 + var6 + "Total used: " + this.field3881 + var5 + "Max-In-Use: " + this.field3882;
    }
}
