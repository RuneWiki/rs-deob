package deob;

@ObfuscatedName("qj")
public class class426 {

    @ObfuscatedName("qj.ac")
    public int field4590;

    @ObfuscatedName("qj.al")
    public int field4588;

    @ObfuscatedName("qj.ak")
    public int field4589;

    @ObfuscatedName("qj.ax")
    public int field4587;

    public class426() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4590).length();
        int var3 = 10 - Integer.toString(this.field4589).length();
        int var4 = 10 - Integer.toString(this.field4588).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4590 + var5 + "Created: " + this.field4588 + var7 + "Total used: " + this.field4589 + var6 + "Max-In-Use: " + this.field4587;
    }
}
