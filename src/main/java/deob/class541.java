package deob;

@ObfuscatedName("ui")
public abstract class class541 {

    @ObfuscatedName("ui.ak")
    public int[] field5218;

    @ObfuscatedName("ui.ax")
    public int field5216;

    @ObfuscatedName("ui.ao")
    public int field5219;

    @ObfuscatedName("ui.ah")
    public float[] field5217;

    @ObfuscatedName("ui.aj(I)V")
    public final void method8779() {
        class540.method8734(this.field5218, this.field5216, this.field5219, this.field5217);
    }

    @ObfuscatedName("ui.an(ZI)V")
    public final void method8781(boolean arg0) {
        this.field5217 = arg0 ? new float[this.field5219 * this.field5216 + 1] : null;
    }

    @ObfuscatedName("ui.ak(IIIIB)V")
    public abstract void method455(int arg0, int arg1, int arg2, int arg3);

    @ObfuscatedName("ui.al(III)V")
    public abstract void method452(int arg0, int arg1);
}
