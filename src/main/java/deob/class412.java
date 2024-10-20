package deob;

@ObfuscatedName("pw")
public class class412 {

    @ObfuscatedName("pw.aw")
    public int field4538;

    @ObfuscatedName("pw.ay")
    public int field4539;

    @ObfuscatedName("pw.ar")
    public int field4540;

    @ObfuscatedName("pw.am")
    public int field4541;

    public class412() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4538).length();
        int var3 = 10 - Integer.toString(this.field4540).length();
        int var4 = 10 - Integer.toString(this.field4539).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4538 + var5 + "Created: " + this.field4539 + var7 + "Total used: " + this.field4540 + var6 + "Max-In-Use: " + this.field4541;
    }
}
