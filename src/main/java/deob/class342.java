package deob;

@ObfuscatedName("mn")
public class class342 extends class190 {

    @ObfuscatedName("mn.at")
    public int field3946;

    @ObfuscatedName("mn.ak")
    public boolean field3952;

    @ObfuscatedName("mn.ax")
    public int field3953;

    @ObfuscatedName("mn.ar")
    public int field3954;

    @ObfuscatedName("mn.al")
    public int field3957;

    @ObfuscatedName("mn.aa")
    public int field3956;

    @ObfuscatedName("mn.as")
    public int field3968;

    @ObfuscatedName("mn.aw")
    public boolean field3958;

    @ObfuscatedName("mn.az")
    public int field3959;

    @ObfuscatedName("mn.ah")
    public int field3960;

    @ObfuscatedName("mn.aj")
    public int field3961;

    @ObfuscatedName("mn.an")
    public int field3963;

    @ObfuscatedName("mn.ai")
    public String field3973;

    @ObfuscatedName("mn.ab")
    public String field3964;

    @ObfuscatedName("mn.au")
    public String field3965;

    @ObfuscatedName("mn.ad")
    public String field3943;

    @ObfuscatedName("mn.af")
    public int field3967;

    @ObfuscatedName("mn.av")
    public int field3951;

    @ObfuscatedName("mn.ao")
    public int field3969;

    @ObfuscatedName("mn.bj")
    public int field3962;

    @ObfuscatedName("mn.bn")
    public String field3971;

    @ObfuscatedName("mn.bi")
    public String field3972;

    @ObfuscatedName("mn.bp")
    public int[] field3949 = new int[3];

    @ObfuscatedName("mn.br")
    public int field3974;

    @ObfuscatedName("mn.bq")
    public String field3975;

    public class342(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24) {
        this.field3946 = arg0;
        this.field3952 = arg1;
        this.field3953 = arg2;
        this.field3954 = arg3;
        this.field3957 = arg4;
        this.field3956 = arg5;
        this.field3968 = arg6;
        this.field3958 = arg7;
        this.field3959 = arg8;
        this.field3960 = arg9;
        this.field3961 = arg10;
        this.field3963 = arg11;
        this.field3973 = arg12;
        this.field3964 = arg13;
        this.field3965 = arg14;
        this.field3943 = arg15;
        this.field3967 = arg16;
        this.field3951 = arg17;
        this.field3969 = arg18;
        this.field3962 = arg19;
        this.field3971 = arg20;
        this.field3972 = arg21;
        this.field3949 = arg22;
        this.field3974 = arg23;
        this.field3975 = arg24;
    }

    @ObfuscatedName("mn.n(Lkx;I)V")
    public void method5999(class311 arg0) {
        arg0.method5279(8);
        arg0.method5279(this.field3946);
        arg0.method5279(this.field3952 ? 1 : 0);
        arg0.method5229(this.field3953);
        arg0.method5279(this.field3954);
        arg0.method5279(this.field3957);
        arg0.method5279(this.field3956);
        arg0.method5279(this.field3968);
        arg0.method5279(this.field3958 ? 1 : 0);
        arg0.method5229(this.field3959);
        arg0.method5279(this.field3960);
        arg0.method5230(this.field3961);
        arg0.method5229(this.field3963);
        arg0.method5236(this.field3973);
        arg0.method5236(this.field3964);
        arg0.method5236(this.field3965);
        arg0.method5236(this.field3943);
        arg0.method5279(this.field3951);
        arg0.method5229(this.field3967);
        arg0.method5236(this.field3971);
        arg0.method5236(this.field3972);
        arg0.method5279(this.field3969);
        arg0.method5279(this.field3962);
        for (int var2 = 0; var2 < this.field3949.length; var2++) {
            arg0.method5231(this.field3949[var2]);
        }
        arg0.method5231(this.field3974);
        arg0.method5236(this.field3975);
    }

    @ObfuscatedName("mn.v(B)I")
    public int method5993() {
        byte var1 = 39;
        int var2 = var1 + class311.method1176(this.field3973);
        int var3 = var2 + class311.method1176(this.field3964);
        int var4 = var3 + class311.method1176(this.field3965);
        int var5 = var4 + class311.method1176(this.field3943);
        String var7 = this.field3971;
        int var8 = var7.length() + 2;
        int var9 = var5 + var8;
        String var11 = this.field3972;
        int var12 = var11.length() + 2;
        int var13 = var9 + var12;
        String var15 = this.field3975;
        int var16 = var15.length() + 2;
        return var13 + var16;
    }
}
