package deob;

@ObfuscatedName("mp")
public class class352 {

    @ObfuscatedName("mp.v")
    public int field4152;

    @ObfuscatedName("mp.c")
    public int field4147;

    @ObfuscatedName("mp.i")
    public int field4149;

    @ObfuscatedName("mp.f")
    public int field4150;

    public class352() throws Throwable {
        throw new Error();
    }

    public String toString() {
        int var1 = 10 - Integer.toString(this.field4152).length();
        int var2 = 10 - Integer.toString(this.field4149).length();
        int var3 = 10 - Integer.toString(this.field4147).length();
        String var4 = "          ".substring(10 - var1);
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        return "    Size: " + this.field4152 + var4 + "Created: " + this.field4147 + var6 + "Total used: " + this.field4149 + var5 + "Max-In-Use: " + this.field4150;
    }
}
