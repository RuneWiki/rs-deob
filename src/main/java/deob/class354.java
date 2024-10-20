package deob;

@ObfuscatedName("mm")
public class class354 {

    @ObfuscatedName("mm.c")
    public int field4240;

    @ObfuscatedName("mm.p")
    public int field4243;

    @ObfuscatedName("mm.f")
    public int field4242;

    @ObfuscatedName("mm.n")
    public int field4241;

    public class354() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4240).length();
        int var3 = 10 - Integer.toString(this.field4242).length();
        int var4 = 10 - Integer.toString(this.field4243).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4240 + var5 + "Created: " + this.field4243 + var7 + "Total used: " + this.field4242 + var6 + "Max-In-Use: " + this.field4241;
    }
}
