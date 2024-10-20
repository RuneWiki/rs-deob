package deob;

@ObfuscatedName("ph")
public class class411 {

    @ObfuscatedName("ph.au")
    public int field4539;

    @ObfuscatedName("ph.ae")
    public int field4535;

    @ObfuscatedName("ph.ao")
    public int field4536;

    @ObfuscatedName("ph.at")
    public int field4538;

    public class411() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4539).length();
        int var3 = 10 - Integer.toString(this.field4536).length();
        int var4 = 10 - Integer.toString(this.field4535).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4539 + var5 + "Created: " + this.field4535 + var7 + "Total used: " + this.field4536 + var6 + "Max-In-Use: " + this.field4538;
    }
}
