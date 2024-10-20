package deob;

import java.util.ArrayList;

@ObfuscatedName("ql")
public class class437 {

    @ObfuscatedName("ql.ab")
    public int field4822 = Integer.MAX_VALUE;

    @ObfuscatedName("ql.az")
    public int field4832 = Integer.MAX_VALUE;

    @ObfuscatedName("ql.ag")
    public int field4830 = 0;

    @ObfuscatedName("ql.ad")
    public int field4831 = 0;

    @ObfuscatedName("ql.ac")
    public int field4837 = 0;

    @ObfuscatedName("ql.av")
    public boolean field4833 = true;

    @ObfuscatedName("ql.ax")
    public class440 field4834;

    @ObfuscatedName("ql.aq")
    public ArrayList field4819 = new ArrayList();

    @ObfuscatedName("ql.al")
    public int field4826 = 0;

    @ObfuscatedName("ql.aa")
    public int field4835 = 0;

    @ObfuscatedName("ql.ap(II)Lqm;")
    public class439 method7810(int arg0) {
        return (class439) this.field4819.get(arg0);
    }

    @ObfuscatedName("ql.aw(I)Lqm;")
    public class439 method7777() {
        return this.field4819.size() == 0 ? null : (class439) this.field4819.get(this.field4819.size() - 1);
    }

    @ObfuscatedName("ql.ak(I)Z")
    public boolean method7778() {
        return this.field4819.size() == 0;
    }

    @ObfuscatedName("ql.aj(B)Z")
    public boolean method7779() {
        return this.field4832 > 1;
    }

    @ObfuscatedName("ql.ai(S)I")
    public int method7780() {
        return this.field4819.size();
    }

    @ObfuscatedName("ql.ay(I)Ljava/lang/String;")
    public String method7781() {
        if (this.method7778()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7780());
        for (int var2 = 0; var2 < this.method7780(); var2++) {
            class439 var3 = this.method7810(var2);
            var1.append(var3.field4840);
        }
        return var1.toString();
    }

    @ObfuscatedName("ql.as(II)V")
    public void method7872(int arg0) {
        if (this.field4834 != null && arg0 < this.field4834.field4851 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4822 != arg0) {
            this.field4822 = arg0;
            this.method7824();
        }
    }

    @ObfuscatedName("ql.ae(II)V")
    public void method7783(int arg0) {
        if (this.field4832 != arg0) {
            this.field4832 = arg0;
            this.method7824();
        }
    }

    @ObfuscatedName("ql.am(II)V")
    public void method7791(int arg0) {
        if (this.field4835 != arg0) {
            this.field4835 = arg0;
            this.method7824();
        }
    }

    @ObfuscatedName("ql.at(Lqa;B)V")
    public void method7843(class440 arg0) {
        if (this.field4834 == arg0) {
            return;
        }
        this.field4834 = arg0;
        if (this.field4834 == null) {
            return;
        }
        if (this.field4837 == 0) {
            this.field4837 = this.field4834.field4851;
        }
        if (!this.method7778()) {
            this.method7824();
        }
    }

    @ObfuscatedName("ql.au(IB)V")
    public void method7775(int arg0) {
        if (this.field4826 != arg0) {
            this.field4826 = arg0;
            this.method7824();
        }
    }

    @ObfuscatedName("ql.an(IIB)Z")
    public boolean method7787(int arg0, int arg1) {
        if (this.field4830 != arg0 || this.field4831 != arg1) {
            this.field4830 = arg0;
            this.field4831 = arg1;
            this.method7824();
        }
        return true;
    }

    @ObfuscatedName("ql.ao(II)V")
    public void method7788(int arg0) {
        if (this.field4837 != arg0) {
            this.field4837 = arg0;
            this.method7824();
        }
    }

    @ObfuscatedName("ql.af(IIB)Lqb;")
    public class441 method7789(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class441(this, 0, 0);
        } else if (arg0 <= this.field4819.size() && arg1 <= this.field4819.size()) {
            return arg1 < arg0 ? new class441(this, arg1, arg0) : new class441(this, arg0, arg1);
        } else {
            return new class441(this, 0, 0);
        }
    }

    @ObfuscatedName("ql.ar(CIII)Lqd;")
    public class438 method7776(char arg0, int arg1, int arg2) {
        return this.method7842(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("ql.ab(Ljava/lang/String;IIB)Lqd;")
    public class438 method7842(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4819.size() >= arg2) {
            this.method7811(arg1, arg1);
            return new class438(arg1, true);
        }
        this.field4819.ensureCapacity(this.field4819.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4819.size() < arg2; var5++) {
            class439 var6 = new class439();
            var6.field4840 = arg0.charAt(var5);
            this.field4819.add(var4, var6);
            var4++;
        }
        this.method7811(arg1, var4);
        if (this.field4832 == 0 || this.method7802() <= this.field4832) {
            return new class438(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method7795(var4);
            if (this.method7802() <= this.field4832) {
                break;
            }
        }
        return new class438(var4, true);
    }

    @ObfuscatedName("ql.az(Ljava/lang/String;II)Lqd;")
    public class438 method7854(String arg0, int arg1) {
        return this.method7842(arg0, this.field4819.size(), arg1);
    }

    @ObfuscatedName("ql.ag(Ljava/lang/String;I)Lqd;")
    public class438 method7793(String arg0) {
        this.method7794();
        return this.method7854(arg0, 0);
    }

    @ObfuscatedName("ql.ad(I)V")
    public void method7794() {
        this.field4819.clear();
    }

    @ObfuscatedName("ql.ac(II)I")
    public int method7795(int arg0) {
        return this.method7887(arg0, arg0 + 1);
    }

    @ObfuscatedName("ql.av(III)I")
    public int method7887(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4819.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method7779() && this.field4826 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class439) this.field4819.get(var4)).field4840;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method7811(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("ql.ax(III)I")
    public int method7797(int arg0, int arg1) {
        if (this.field4834 == null) {
            return 0;
        } else if (this.method7779() && arg0 > this.field4822) {
            return this.field4819.size();
        } else {
            if (!this.field4819.isEmpty()) {
                for (int var3 = 0; var3 < this.field4819.size(); var3++) {
                    class439 var4 = (class439) this.field4819.get(var3);
                    if (arg1 <= var4.field4842 + this.method7801()) {
                        if (arg1 < var4.field4842) {
                            break;
                        }
                        if (arg0 < var4.field4841) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4819.size() && ((class439) this.field4819.get(var3 + 1)).field4842 != var4.field4842) {
                            int var5 = this.method7813((class439) this.field4819.get(var3), false);
                            if (arg0 < var4.field4841 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4842 + this.method7801()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class439 var6 = (class439) this.field4819.get(this.field4819.size() - 1);
                if (arg0 >= var6.field4841 && arg0 <= var6.field4841 + this.method7803() && arg1 >= var6.field4842 && arg1 <= var6.field4842 + this.method7801()) {
                    return this.field4819.size() - 1;
                }
            }
            return this.field4819.size();
        }
    }

    @ObfuscatedName("ql.aq(III)I")
    public int method7798(int arg0, int arg1) {
        if (this.field4834 == null || this.method7778() || arg0 > this.field4819.size()) {
            return 0;
        }
        byte var3;
        if (arg1 > 0) {
            var3 = 1;
        } else {
            var3 = -1;
            arg1 = -arg1;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 > 0) {
            class439 var6 = (class439) this.field4819.get(arg0 - 1);
            var4 = var6.field4841 + this.method7889(arg0 - 1);
            var5 = var6.field4842;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4819.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class439 var13 = (class439) this.field4819.get(var12 - 1);
            if (var13.field4842 != var5) {
                var8++;
                var5 = var13.field4842;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4841 + this.method7889(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4819.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("ql.al(I)I")
    public int method7799() {
        if (!this.field4819.isEmpty() && this.method7802() == 1) {
            return this.field4819.isEmpty() ? 0 : ((class439) this.field4819.get(this.field4819.size() - 1)).field4841 + this.method7803();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4819.size() - 1; var3 >= 0; var3--) {
            class439 var4 = (class439) this.field4819.get(var3);
            if (var4.field4842 != var1) {
                int var5 = this.method7813(var4, false) + var4.field4841;
                var2 = Math.max(var5, var2);
                var1 = var4.field4842;
            }
        }
        return var2;
    }

    @ObfuscatedName("ql.aa(B)I")
    public int method7796() {
        return this.method7778() ? 0 : this.field4834.field4851 + ((class439) this.field4819.get(this.field4819.size() - 1)).field4842;
    }

    @ObfuscatedName("ql.ah(I)I")
    public int method7801() {
        return this.field4837;
    }

    @ObfuscatedName("ql.bh(I)I")
    public int method7802() {
        return this.method7796() / this.field4834.field4851;
    }

    @ObfuscatedName("ql.bj(I)I")
    public int method7803() {
        return this.method7778() ? 0 : this.method7813((class439) this.field4819.get(this.field4819.size() - 1), false);
    }

    @ObfuscatedName("ql.bv(I)I")
    public int method7804() {
        return this.field4822;
    }

    @ObfuscatedName("ql.bx(I)I")
    public int method7836() {
        return this.field4832;
    }

    @ObfuscatedName("ql.bk(I)I")
    public int method7806() {
        return this.field4826;
    }

    @ObfuscatedName("ql.bb(I)I")
    public int method7881() {
        return this.field4835;
    }

    @ObfuscatedName("ql.bq(II)I")
    public int method7808(int arg0) {
        switch(this.field4830) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                return 0;
        }
    }

    @ObfuscatedName("ql.bp(II)I")
    public int method7809(int arg0) {
        switch(this.field4831) {
            case 0:
                return 0;
            case 1:
                return arg0 / 2;
            case 2:
                return arg0;
            default:
                return 0;
        }
    }

    @ObfuscatedName("ql.bz(I)V")
    public void method7824() {
        this.method7811(0, this.field4819.size());
    }

    @ObfuscatedName("ql.bc(III)V")
    public void method7811(int arg0, int arg1) {
        if (this.method7778() || this.field4834 == null) {
            return;
        }
        class528 var3 = this.method7901(arg0, arg1);
        boolean var4 = (Integer) var3.field5317 == 0 && (Integer) var3.field5318 == this.field4819.size();
        int var5 = (Integer) var3.field5317;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class439) this.field4819.get((Integer) var3.field5317)).field4842;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5317; var9 <= (Integer) var3.field5318; var9++) {
            boolean var10 = var9 >= this.field4819.size();
            class439 var11 = (class439) this.field4819.get(var10 ? this.field4819.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method7813(var11, false);
            boolean var13 = !var10 && var11.field4840 == '\n';
            boolean var14 = !var10 && this.method7779() && var6 + var12 > this.field4822;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4826 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class439 var19 = (class439) this.field4819.get(var18);
                            var17 += var18 < var15 ? this.method7813(var19, false) : 0;
                            if (var19.field4840 == ' ' || var19.field4840 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method7808(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class439 var22 = (class439) this.field4819.get(var21);
                    int var23 = this.method7813(var22, false);
                    var22.field4841 = var20;
                    var22.field4842 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method7801();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4831 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method7801();
        int var25 = this.method7809(var24);
        for (int var26 = 0; var26 < this.field4819.size(); var26++) {
            class439 var27 = (class439) this.field4819.get(var26);
            var27.field4842 -= var25;
        }
    }

    @ObfuscatedName("ql.by(II)I")
    public int method7889(int arg0) {
        return arg0 < this.field4819.size() ? this.method7813((class439) this.field4819.get(arg0), false) : 0;
    }

    @ObfuscatedName("ql.br(Lqm;ZI)I")
    public int method7813(class439 arg0, boolean arg1) {
        if (arg0.field4840 == '\n') {
            return 0;
        } else if (arg1 || this.field4835 == 0) {
            int var3 = this.field4834.field4845[arg0.field4840];
            if (var3 == 0) {
                return arg0.field4840 == '\t' ? this.field4834.field4845[32] * 3 : this.field4834.field4845[32];
            } else {
                return var3;
            }
        } else {
            return this.field4834.field4845[42];
        }
    }

    @ObfuscatedName("ql.bn(III)Luy;")
    public class528 method7901(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4819.size();
        if (var3 == 0 && var4 == var5) {
            return new class528(0, var5);
        }
        int var6 = this.method7815(var3, false);
        int var7 = this.method7816(var4, false);
        switch(this.field4831) {
            case 0:
                if (this.field4830 == 0) {
                    return new class528(var6, var5);
                }
                int var9 = this.method7815(var3, true);
                return new class528(var9, var5);
            case 1:
                return new class528(0, var5);
            case 2:
                if (this.field4830 == 2) {
                    return new class528(0, var7);
                }
                int var8 = this.method7816(var4, true);
                return new class528(0, var8);
            default:
                return new class528(0, var5);
        }
    }

    @ObfuscatedName("ql.bu(IZI)I")
    public int method7815(int arg0, boolean arg1) {
        if (arg0 < this.field4819.size()) {
            int var3 = ((class439) this.field4819.get(arg0)).field4842;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class439) this.field4819.get(var4 - 1)).field4842 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class439) this.field4819.get(var4 - 1)).field4842;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("ql.bt(IZI)I")
    public int method7816(int arg0, boolean arg1) {
        if (arg0 < this.field4819.size()) {
            int var3 = ((class439) this.field4819.get(arg0)).field4842;
            for (int var4 = arg0; var4 < this.field4819.size() - 1; var4++) {
                if (((class439) this.field4819.get(var4 + 1)).field4842 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class439) this.field4819.get(var4 + 1)).field4842;
                }
            }
        }
        return this.field4819.size();
    }
}
