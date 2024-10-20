package deob;

@ObfuscatedName("my")
public class class353 {

    @ObfuscatedName("my.s")
    public int field4199;

    @ObfuscatedName("my.h")
    public int field4198;

    @ObfuscatedName("my.w")
    public int field4201;

    @ObfuscatedName("my.v")
    public int field4200;

    public class353() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4199).length();
        int var3 = 10 - Integer.toString(this.field4201).length();
        int var4 = 10 - Integer.toString(this.field4198).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4199 + var5 + "Created: " + this.field4198 + var7 + "Total used: " + this.field4201 + var6 + "Max-In-Use: " + this.field4200;
    }
}
