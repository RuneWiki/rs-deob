package deob;

@ObfuscatedName("qy")
public class class423 {

    @ObfuscatedName("qy.at")
    public int field4573;

    @ObfuscatedName("qy.ah")
    public int field4570;

    @ObfuscatedName("qy.ar")
    public int field4571;

    @ObfuscatedName("qy.ao")
    public int field4572;

    public class423() throws Throwable {
        throw new Error();
    }

    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field4573).length();
        int var3 = 10 - Integer.toString(this.field4571).length();
        int var4 = 10 - Integer.toString(this.field4570).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field4573 + var5 + "Created: " + this.field4570 + var7 + "Total used: " + this.field4571 + var6 + "Max-In-Use: " + this.field4572;
    }
}
