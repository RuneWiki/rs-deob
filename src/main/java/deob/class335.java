package deob;

@ObfuscatedName("lb")
public class class335 {

    @ObfuscatedName("lb.c")
    public int field4016;

    @ObfuscatedName("lb.b")
    public int field4015;

    @ObfuscatedName("lb.p")
    public int field4017;

    @ObfuscatedName("lb.m")
    public int field4018;

    public class335() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4016).length();
        int var3 = 10 - Integer.toString(this.field4017).length();
        int var4 = 10 - Integer.toString(this.field4015).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4016 + var5 + "Created: " + this.field4015 + var7 + "Total used: " + this.field4017 + var6 + "Max-In-Use: " + this.field4018;
    }
}
