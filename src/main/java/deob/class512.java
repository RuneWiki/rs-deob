package deob;

@ObfuscatedName("tk")
public abstract class class512 {

    @ObfuscatedName("tk.av")
    public int[] field5098;

    @ObfuscatedName("tk.as")
    public int field5097;

    @ObfuscatedName("tk.ax")
    public int field5095;

    @ObfuscatedName("tk.ap")
    public float[] field5096;

    @ObfuscatedName("tk.ah(I)V")
    public final void method8555() {
        class511.method8458(this.field5098, this.field5097, this.field5095, this.field5096);
    }

    @ObfuscatedName("tk.az(ZI)V")
    public final void method8552(boolean arg0) {
        this.field5096 = arg0 ? new float[this.field5097 * this.field5095 + 1] : null;
    }

    @ObfuscatedName("tk.an(IIS)V")
    public abstract void method433(int arg0, int arg1);

    @ObfuscatedName("tk.av(IIIII)V")
    public abstract void method435(int arg0, int arg1, int arg2, int arg3);
}
