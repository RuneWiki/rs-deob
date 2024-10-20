package deob;

@ObfuscatedName("mp")
public class class353 {

    @ObfuscatedName("mp.o")
    public int field4206;

    @ObfuscatedName("mp.q")
    public int field4207;

    @ObfuscatedName("mp.l")
    public int field4209;

    @ObfuscatedName("mp.k")
    public int field4208;

    public class353() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4206).length();
        int var3 = 10 - Integer.toString(this.field4209).length();
        int var4 = 10 - Integer.toString(this.field4207).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4206 + var5 + "Created: " + this.field4207 + var7 + "Total used: " + this.field4209 + var6 + "Max-In-Use: " + this.field4208;
    }
}
