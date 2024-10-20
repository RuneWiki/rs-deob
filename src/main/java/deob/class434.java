package deob;

import java.util.ArrayList;

@ObfuscatedName("qd")
public class class434 {

    @ObfuscatedName("qd.af")
    public int field4731 = Integer.MAX_VALUE;

    @ObfuscatedName("qd.aa")
    public int field4742 = Integer.MAX_VALUE;

    @ObfuscatedName("qd.ah")
    public int field4734 = 0;

    @ObfuscatedName("qd.ag")
    public int field4724 = 0;

    @ObfuscatedName("qd.av")
    public int field4735 = 0;

    @ObfuscatedName("qd.ar")
    public boolean field4737 = true;

    @ObfuscatedName("qd.ap")
    public class437 field4728;

    @ObfuscatedName("qd.ak")
    public ArrayList field4732 = new ArrayList();

    @ObfuscatedName("qd.ai")
    public int field4733 = 0;

    @ObfuscatedName("qd.at")
    public int field4740 = 0;

    @ObfuscatedName("qd.ab(II)Lqu;")
    public class436 method7389(int arg0) {
        return (class436) this.field4732.get(arg0);
    }

    @ObfuscatedName("qd.ay(B)Lqu;")
    public class436 method7390() {
        return this.field4732.size() == 0 ? null : (class436) this.field4732.get(this.field4732.size() - 1);
    }

    @ObfuscatedName("qd.an(S)Z")
    public boolean method7391() {
        return this.field4732.size() == 0;
    }

    @ObfuscatedName("qd.au(I)Z")
    public boolean method7392() {
        return this.field4742 > 1;
    }

    @ObfuscatedName("qd.ax(B)I")
    public int method7393() {
        return this.field4732.size();
    }

    @ObfuscatedName("qd.ao(B)Ljava/lang/String;")
    public String method7479() {
        if (this.method7391()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7393());
        for (int var2 = 0; var2 < this.method7393(); var2++) {
            class436 var3 = this.method7389(var2);
            var1.append(var3.field4748);
        }
        return var1.toString();
    }

    @ObfuscatedName("qd.am(IB)V")
    public void method7395(int arg0) {
        if (this.field4728 != null && arg0 < this.field4728.field4756 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4731 != arg0) {
            this.field4731 = arg0;
            this.method7423();
        }
    }

    @ObfuscatedName("qd.ac(II)V")
    public void method7516(int arg0) {
        if (this.field4742 != arg0) {
            this.field4742 = arg0;
            this.method7423();
        }
    }

    @ObfuscatedName("qd.ae(II)V")
    public void method7397(int arg0) {
        if (this.field4740 != arg0) {
            this.field4740 = arg0;
            this.method7423();
        }
    }

    @ObfuscatedName("qd.ad(Lqv;B)V")
    public void method7398(class437 arg0) {
        if (this.field4728 == arg0) {
            return;
        }
        this.field4728 = arg0;
        if (this.field4728 == null) {
            return;
        }
        if (this.field4735 == 0) {
            this.field4735 = this.field4728.field4756;
        }
        if (!this.method7391()) {
            this.method7423();
        }
    }

    @ObfuscatedName("qd.aq(II)V")
    public void method7399(int arg0) {
        if (this.field4733 != arg0) {
            this.field4733 = arg0;
            this.method7423();
        }
    }

    @ObfuscatedName("qd.al(III)Z")
    public boolean method7400(int arg0, int arg1) {
        if (this.field4734 != arg0 || this.field4724 != arg1) {
            this.field4734 = arg0;
            this.field4724 = arg1;
            this.method7423();
        }
        return true;
    }

    @ObfuscatedName("qd.aj(II)V")
    public void method7495(int arg0) {
        if (this.field4735 != arg0) {
            this.field4735 = arg0;
            this.method7423();
        }
    }

    @ObfuscatedName("qd.as(IIB)Lqx;")
    public class438 method7471(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class438(this, 0, 0);
        } else if (arg0 <= this.field4732.size() && arg1 <= this.field4732.size()) {
            return arg1 < arg0 ? new class438(this, arg1, arg0) : new class438(this, arg0, arg1);
        } else {
            return new class438(this, 0, 0);
        }
    }

    @ObfuscatedName("qd.aw(CIII)Lqg;")
    public class435 method7388(char arg0, int arg1, int arg2) {
        return this.method7404(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("qd.af(Ljava/lang/String;III)Lqg;")
    public class435 method7404(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4732.size() >= arg2) {
            this.method7424(arg1, arg1);
            return new class435(arg1, true);
        }
        this.field4732.ensureCapacity(this.field4732.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4732.size() < arg2; var5++) {
            class436 var6 = new class436();
            var6.field4748 = arg0.charAt(var5);
            this.field4732.add(var4, var6);
            var4++;
        }
        this.method7424(arg1, var4);
        if (this.field4742 == 0 || this.method7461() <= this.field4742) {
            return new class435(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method7408(var4);
            if (this.method7461() <= this.field4742) {
                break;
            }
        }
        return new class435(var4, true);
    }

    @ObfuscatedName("qd.aa(Ljava/lang/String;IB)Lqg;")
    public class435 method7405(String arg0, int arg1) {
        return this.method7404(arg0, this.field4732.size(), arg1);
    }

    @ObfuscatedName("qd.ah(Ljava/lang/String;I)Lqg;")
    public class435 method7406(String arg0) {
        this.method7407();
        return this.method7405(arg0, 0);
    }

    @ObfuscatedName("qd.ag(I)V")
    public void method7407() {
        this.field4732.clear();
    }

    @ObfuscatedName("qd.av(II)I")
    public int method7408(int arg0) {
        return this.method7429(arg0, arg0 + 1);
    }

    @ObfuscatedName("qd.ar(III)I")
    public int method7429(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4732.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method7392() && this.field4733 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class436) this.field4732.get(var4)).field4748;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method7424(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("qd.ap(III)I")
    public int method7437(int arg0, int arg1) {
        if (this.field4728 == null) {
            return 0;
        } else if (this.method7392() && arg0 > this.field4731) {
            return this.field4732.size();
        } else {
            if (!this.field4732.isEmpty()) {
                for (int var3 = 0; var3 < this.field4732.size(); var3++) {
                    class436 var4 = (class436) this.field4732.get(var3);
                    if (arg1 <= var4.field4747 + this.method7518()) {
                        if (arg1 < var4.field4747) {
                            break;
                        }
                        if (arg0 < var4.field4745) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4732.size() && ((class436) this.field4732.get(var3 + 1)).field4747 != var4.field4747) {
                            int var5 = this.method7426((class436) this.field4732.get(var3), false);
                            if (arg0 < var4.field4745 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4747 + this.method7518()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class436 var6 = (class436) this.field4732.get(this.field4732.size() - 1);
                if (arg0 >= var6.field4745 && arg0 <= var6.field4745 + this.method7421() && arg1 >= var6.field4747 && arg1 <= var6.field4747 + this.method7518()) {
                    return this.field4732.size() - 1;
                }
            }
            return this.field4732.size();
        }
    }

    @ObfuscatedName("qd.ak(III)I")
    public int method7411(int arg0, int arg1) {
        if (this.field4728 == null || this.method7391() || arg0 > this.field4732.size()) {
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
            class436 var6 = (class436) this.field4732.get(arg0 - 1);
            var4 = var6.field4745 + this.method7425(arg0 - 1);
            var5 = var6.field4747;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4732.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class436 var13 = (class436) this.field4732.get(var12 - 1);
            if (var13.field4747 != var5) {
                var8++;
                var5 = var13.field4747;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4745 + this.method7425(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4732.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("qd.ai(I)I")
    public int method7419() {
        if (!this.field4732.isEmpty() && this.method7461() == 1) {
            return this.field4732.isEmpty() ? 0 : ((class436) this.field4732.get(this.field4732.size() - 1)).field4745 + this.method7421();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4732.size() - 1; var3 >= 0; var3--) {
            class436 var4 = (class436) this.field4732.get(var3);
            if (var4.field4747 != var1) {
                int var5 = this.method7426(var4, false) + var4.field4745;
                var2 = Math.max(var5, var2);
                var1 = var4.field4747;
            }
        }
        return var2;
    }

    @ObfuscatedName("qd.at(B)I")
    public int method7410() {
        return this.method7391() ? 0 : this.field4728.field4756 + ((class436) this.field4732.get(this.field4732.size() - 1)).field4747;
    }

    @ObfuscatedName("qd.az(I)I")
    public int method7518() {
        return this.field4735;
    }

    @ObfuscatedName("qd.bg(S)I")
    public int method7461() {
        return this.method7410() / this.field4728.field4756;
    }

    @ObfuscatedName("qd.bz(S)I")
    public int method7421() {
        return this.method7391() ? 0 : this.method7426((class436) this.field4732.get(this.field4732.size() - 1), false);
    }

    @ObfuscatedName("qd.bj(I)I")
    public int method7417() {
        return this.field4731;
    }

    @ObfuscatedName("qd.bc(I)I")
    public int method7458() {
        return this.field4742;
    }

    @ObfuscatedName("qd.bo(B)I")
    public int method7428() {
        return this.field4733;
    }

    @ObfuscatedName("qd.bm(I)I")
    public int method7420() {
        return this.field4740;
    }

    @ObfuscatedName("qd.bd(IB)I")
    public int method7457(int arg0) {
        switch(this.field4734) {
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

    @ObfuscatedName("qd.bh(II)I")
    public int method7441(int arg0) {
        switch(this.field4724) {
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

    @ObfuscatedName("qd.bx(I)V")
    public void method7423() {
        this.method7424(0, this.field4732.size());
    }

    @ObfuscatedName("qd.bv(IIB)V")
    public void method7424(int arg0, int arg1) {
        if (this.method7391() || this.field4728 == null) {
            return;
        }
        class519 var3 = this.method7403(arg0, arg1);
        boolean var4 = (Integer) var3.field5230 == 0 && (Integer) var3.field5228 == this.field4732.size();
        int var5 = (Integer) var3.field5230;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class436) this.field4732.get((Integer) var3.field5230)).field4747;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5230; var9 <= (Integer) var3.field5228; var9++) {
            boolean var10 = var9 >= this.field4732.size();
            class436 var11 = (class436) this.field4732.get(var10 ? this.field4732.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method7426(var11, false);
            boolean var13 = !var10 && var11.field4748 == '\n';
            boolean var14 = !var10 && this.method7392() && var6 + var12 > this.field4731;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4733 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class436 var19 = (class436) this.field4732.get(var18);
                            var17 += var18 < var15 ? this.method7426(var19, false) : 0;
                            if (var19.field4748 == ' ' || var19.field4748 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method7457(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class436 var22 = (class436) this.field4732.get(var21);
                    int var23 = this.method7426(var22, false);
                    var22.field4745 = var20;
                    var22.field4747 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method7518();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4724 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method7518();
        int var25 = this.method7441(var24);
        for (int var26 = 0; var26 < this.field4732.size(); var26++) {
            class436 var27 = (class436) this.field4732.get(var26);
            var27.field4747 -= var25;
        }
    }

    @ObfuscatedName("qd.bu(II)I")
    public int method7425(int arg0) {
        return arg0 < this.field4732.size() ? this.method7426((class436) this.field4732.get(arg0), false) : 0;
    }

    @ObfuscatedName("qd.bp(Lqu;ZS)I")
    public int method7426(class436 arg0, boolean arg1) {
        if (arg0.field4748 == '\n') {
            return 0;
        } else if (arg1 || this.field4740 == 0) {
            int var3 = this.field4728.field4771[arg0.field4748];
            if (var3 == 0) {
                return arg0.field4748 == '\t' ? this.field4728.field4771[32] * 3 : this.field4728.field4771[32];
            } else {
                return var3;
            }
        } else {
            return this.field4728.field4771[42];
        }
    }

    @ObfuscatedName("qd.br(III)Ltj;")
    public class519 method7403(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4732.size();
        if (var3 == 0 && var4 == var5) {
            return new class519(0, var5);
        }
        int var6 = this.method7422(var3, false);
        int var7 = this.method7442(var4, false);
        switch(this.field4724) {
            case 0:
                if (this.field4734 == 0) {
                    return new class519(var6, var5);
                }
                int var9 = this.method7422(var3, true);
                return new class519(var9, var5);
            case 1:
                return new class519(0, var5);
            case 2:
                if (this.field4734 == 2) {
                    return new class519(0, var7);
                }
                int var8 = this.method7442(var4, true);
                return new class519(0, var8);
            default:
                return new class519(0, var5);
        }
    }

    @ObfuscatedName("qd.bf(IZI)I")
    public int method7422(int arg0, boolean arg1) {
        if (arg0 < this.field4732.size()) {
            int var3 = ((class436) this.field4732.get(arg0)).field4747;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class436) this.field4732.get(var4 - 1)).field4747 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class436) this.field4732.get(var4 - 1)).field4747;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("qd.bq(IZI)I")
    public int method7442(int arg0, boolean arg1) {
        if (arg0 < this.field4732.size()) {
            int var3 = ((class436) this.field4732.get(arg0)).field4747;
            for (int var4 = arg0; var4 < this.field4732.size() - 1; var4++) {
                if (((class436) this.field4732.get(var4 + 1)).field4747 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class436) this.field4732.get(var4 + 1)).field4747;
                }
            }
        }
        return this.field4732.size();
    }
}
