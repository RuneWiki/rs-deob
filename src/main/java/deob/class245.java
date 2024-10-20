package deob;

@ObfuscatedName("jl")
public class class245 {

    @ObfuscatedName("jl.au")
    public boolean field2817 = false;

    @ObfuscatedName("jl.ae")
    public boolean field2812 = true;

    @ObfuscatedName("jl.ao")
    public int field2824 = 0;

    @ObfuscatedName("jl.ai")
    public int field2816 = 512;

    @ObfuscatedName("jl.az")
    public class249 field2813;

    @ObfuscatedName("jl.al")
    public int field2811;

    @ObfuscatedName("jl.an")
    public int field2826;

    @ObfuscatedName("jl.ar")
    public int field2825;

    @ObfuscatedName("jl.ab")
    public int field2823;

    @ObfuscatedName("jl.ag")
    public int field2820;

    @ObfuscatedName("jl.am")
    public int field2828;

    @ObfuscatedName("jl.ax")
    public int field2829;

    @ObfuscatedName("jl.ah")
    public int field2830;

    @ObfuscatedName("jl.as")
    public int[] field2827 = new int[1024];

    @ObfuscatedName("jl.au()V")
    public void method4610() {
        this.field2811 = this.field2825 / 2;
        this.field2826 = this.field2823 / 2;
        this.field2820 = -this.field2811;
        this.field2828 = this.field2825 - this.field2811;
        this.field2829 = -this.field2826;
        this.field2830 = this.field2823 - this.field2826;
    }

    @ObfuscatedName("jl.ae(IIII)V")
    public void method4616(int arg0, int arg1, int arg2, int arg3) {
        this.field2811 = arg0 - arg1;
        this.field2826 = arg2 - arg3;
        this.field2820 = -this.field2811;
        this.field2828 = this.field2825 - this.field2811;
        this.field2829 = -this.field2826;
        this.field2830 = this.field2823 - this.field2826;
    }

    @ObfuscatedName("jl.ao(III)V")
    public void method4612(int arg0, int arg1, int arg2) {
        this.field2817 = arg0 < 0 || arg0 > this.field2825 || arg1 < 0 || arg1 > this.field2825 || arg2 < 0 || arg2 > this.field2825;
    }
}
