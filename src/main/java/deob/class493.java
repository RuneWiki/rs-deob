package deob;

@ObfuscatedName("sc")
public class class493 extends class495 {

    @ObfuscatedName("sc.ac")
    public int field4909 = 0;

    @ObfuscatedName("sc.al")
    public int field4910 = 0;

    @ObfuscatedName("sc.ak")
    public int field4911 = 0;

    @ObfuscatedName("sc.ax")
    public int field4912 = 0;

    @ObfuscatedName("sc.ao")
    public int field4913 = 0;

    @ObfuscatedName("sc.ah")
    public int field4914 = 0;

    public class493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4909 = arg0;
        this.field4910 = arg1;
        this.field4911 = arg2;
        this.field4912 = arg3;
        this.field4913 = arg4;
        this.field4914 = arg5;
    }

    @ObfuscatedName("sc.ac(I)I")
    public int method7810() {
        double var1 = this.method7824();
        return (int) Math.round((double) (this.field4912 - this.field4909) * var1 + (double) this.field4909);
    }

    @ObfuscatedName("sc.al(I)I")
    public int method7812() {
        double var1 = this.method7824();
        return (int) Math.round((double) (this.field4913 - this.field4910) * var1 + (double) this.field4910);
    }

    @ObfuscatedName("sc.ak(B)I")
    public int method7808() {
        double var1 = this.method7824();
        return (int) Math.round((double) (this.field4914 - this.field4911) * var1 + (double) this.field4911);
    }
}
