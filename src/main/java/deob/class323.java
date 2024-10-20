package deob;

@ObfuscatedName("lx")
public class class323 {

    @ObfuscatedName("lx.i")
    public int field3873;

    @ObfuscatedName("lx.w")
    public int field3875;

    @ObfuscatedName("lx.s")
    public int field3871;

    @ObfuscatedName("lx.a")
    public int field3872;

    public class323() throws Throwable {
        throw new Error();
    }

    public String toString() {
        int var1 = 10 - Integer.toString(this.field3873).length();
        int var2 = 10 - Integer.toString(this.field3871).length();
        int var3 = 10 - Integer.toString(this.field3875).length();
        String var4 = "          ".substring(10 - var1);
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        return "    Size: " + this.field3873 + var4 + "Created: " + this.field3875 + var6 + "Total used: " + this.field3871 + var5 + "Max-In-Use: " + this.field3872;
    }
}
