package deob;

import java.util.ArrayList;

@ObfuscatedName("ql")
public class class433 {

    @ObfuscatedName("ql.ac")
    public int field4748 = Integer.MAX_VALUE;

    @ObfuscatedName("ql.al")
    public int field4749 = Integer.MAX_VALUE;

    @ObfuscatedName("ql.ay")
    public int field4752 = 0;

    @ObfuscatedName("ql.ao")
    public int field4754 = 0;

    @ObfuscatedName("ql.aa")
    public int field4757 = 0;

    @ObfuscatedName("ql.as")
    public boolean field4753 = true;

    @ObfuscatedName("ql.aw")
    public class436 field4741;

    @ObfuscatedName("ql.at")
    public ArrayList field4755 = new ArrayList();

    @ObfuscatedName("ql.af")
    public int field4756 = 0;

    @ObfuscatedName("ql.am")
    public int field4745 = 0;

    @ObfuscatedName("ql.aq(IB)Lqf;")
    public class435 method7264(int arg0) {
        return (class435) this.field4755.get(arg0);
    }

    @ObfuscatedName("ql.ad(S)Lqf;")
    public class435 method7344() {
        return this.field4755.size() == 0 ? null : (class435) this.field4755.get(this.field4755.size() - 1);
    }

    @ObfuscatedName("ql.ag(B)Z")
    public boolean method7281() {
        return this.field4755.size() == 0;
    }

    @ObfuscatedName("ql.ak(I)Z")
    public boolean method7267() {
        return this.field4749 > 1;
    }

    @ObfuscatedName("ql.ap(B)I")
    public int method7329() {
        return this.field4755.size();
    }

    @ObfuscatedName("ql.an(B)Ljava/lang/String;")
    public String method7269() {
        if (this.method7281()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7329());
        for (int var2 = 0; var2 < this.method7329(); var2++) {
            class435 var3 = this.method7264(var2);
            var1.append(var3.field4764);
        }
        return var1.toString();
    }

    @ObfuscatedName("ql.aj(IB)V")
    public void method7354(int arg0) {
        if (this.field4741 != null && arg0 < this.field4741.field4768 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4748 != arg0) {
            this.field4748 = arg0;
            this.method7297();
        }
    }

    @ObfuscatedName("ql.av(IB)V")
    public void method7375(int arg0) {
        if (this.field4749 != arg0) {
            this.field4749 = arg0;
            this.method7297();
        }
    }

    @ObfuscatedName("ql.ab(II)V")
    public void method7272(int arg0) {
        if (this.field4745 != arg0) {
            this.field4745 = arg0;
            this.method7297();
        }
    }

    @ObfuscatedName("ql.ai(Lqz;B)V")
    public void method7319(class436 arg0) {
        if (this.field4741 == arg0) {
            return;
        }
        this.field4741 = arg0;
        if (this.field4741 == null) {
            return;
        }
        if (this.field4757 == 0) {
            this.field4757 = this.field4741.field4768;
        }
        if (!this.method7281()) {
            this.method7297();
        }
    }

    @ObfuscatedName("ql.ae(IB)V")
    public void method7274(int arg0) {
        if (this.field4756 != arg0) {
            this.field4756 = arg0;
            this.method7297();
        }
    }

    @ObfuscatedName("ql.au(III)Z")
    public boolean method7374(int arg0, int arg1) {
        if (this.field4752 != arg0 || this.field4754 != arg1) {
            this.field4752 = arg0;
            this.field4754 = arg1;
            this.method7297();
        }
        return true;
    }

    @ObfuscatedName("ql.ah(IB)V")
    public void method7276(int arg0) {
        if (this.field4757 != arg0) {
            this.field4757 = arg0;
            this.method7297();
        }
    }

    @ObfuscatedName("ql.az(IIB)Lqw;")
    public class437 method7277(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class437(this, 0, 0);
        } else if (arg0 <= this.field4755.size() && arg1 <= this.field4755.size()) {
            return arg1 < arg0 ? new class437(this, arg1, arg0) : new class437(this, arg0, arg1);
        } else {
            return new class437(this, 0, 0);
        }
    }

    @ObfuscatedName("ql.ax(CIIS)Lqk;")
    public class434 method7364(char arg0, int arg1, int arg2) {
        return this.method7390(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("ql.ac(Ljava/lang/String;III)Lqk;")
    public class434 method7390(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4755.size() >= arg2) {
            this.method7298(arg1, arg1);
            return new class434(arg1, true);
        }
        this.field4755.ensureCapacity(this.field4755.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4755.size() < arg2; var5++) {
            class435 var6 = new class435();
            var6.field4764 = arg0.charAt(var5);
            this.field4755.add(var4, var6);
            var4++;
        }
        this.method7298(arg1, var4);
        if (this.field4749 == 0 || this.method7380() <= this.field4749) {
            return new class434(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method7326(var4);
            if (this.method7380() <= this.field4749) {
                break;
            }
        }
        return new class434(var4, true);
    }

    @ObfuscatedName("ql.al(Ljava/lang/String;IB)Lqk;")
    public class434 method7280(String arg0, int arg1) {
        return this.method7390(arg0, this.field4755.size(), arg1);
    }

    @ObfuscatedName("ql.ay(Ljava/lang/String;B)Lqk;")
    public class434 method7385(String arg0) {
        this.method7415();
        return this.method7280(arg0, 0);
    }

    @ObfuscatedName("ql.ao(I)V")
    public void method7415() {
        this.field4755.clear();
    }

    @ObfuscatedName("ql.aa(IB)I")
    public int method7326(int arg0) {
        return this.method7283(arg0, arg0 + 1);
    }

    @ObfuscatedName("ql.as(IIB)I")
    public int method7283(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4755.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method7267() && this.field4756 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class435) this.field4755.get(var4)).field4764;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method7298(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("ql.aw(III)I")
    public int method7271(int arg0, int arg1) {
        if (this.field4741 == null) {
            return 0;
        } else if (this.method7267() && arg0 > this.field4748) {
            return this.field4755.size();
        } else {
            if (!this.field4755.isEmpty()) {
                for (int var3 = 0; var3 < this.field4755.size(); var3++) {
                    class435 var4 = (class435) this.field4755.get(var3);
                    if (arg1 <= var4.field4765 + this.method7288()) {
                        if (arg1 < var4.field4765) {
                            break;
                        }
                        if (arg0 < var4.field4767) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4755.size() && ((class435) this.field4755.get(var3 + 1)).field4765 != var4.field4765) {
                            int var5 = this.method7300((class435) this.field4755.get(var3), false);
                            if (arg0 < var4.field4767 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4765 + this.method7288()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class435 var6 = (class435) this.field4755.get(this.field4755.size() - 1);
                if (arg0 >= var6.field4767 && arg0 <= var6.field4767 + this.method7339() && arg1 >= var6.field4765 && arg1 <= var6.field4765 + this.method7288()) {
                    return this.field4755.size() - 1;
                }
            }
            return this.field4755.size();
        }
    }

    @ObfuscatedName("ql.at(IIB)I")
    public int method7285(int arg0, int arg1) {
        if (this.field4741 == null || this.method7281() || arg0 > this.field4755.size()) {
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
            class435 var6 = (class435) this.field4755.get(arg0 - 1);
            var4 = var6.field4767 + this.method7388(arg0 - 1);
            var5 = var6.field4765;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4755.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class435 var13 = (class435) this.field4755.get(var12 - 1);
            if (var13.field4765 != var5) {
                var8++;
                var5 = var13.field4765;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4767 + this.method7388(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4755.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("ql.af(I)I")
    public int method7286() {
        if (!this.field4755.isEmpty() && this.method7380() == 1) {
            return this.field4755.isEmpty() ? 0 : ((class435) this.field4755.get(this.field4755.size() - 1)).field4767 + this.method7339();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4755.size() - 1; var3 >= 0; var3--) {
            class435 var4 = (class435) this.field4755.get(var3);
            if (var4.field4765 != var1) {
                int var5 = this.method7300(var4, false) + var4.field4767;
                var2 = Math.max(var5, var2);
                var1 = var4.field4765;
            }
        }
        return var2;
    }

    @ObfuscatedName("ql.am(I)I")
    public int method7287() {
        return this.method7281() ? 0 : this.field4741.field4768 + ((class435) this.field4755.get(this.field4755.size() - 1)).field4765;
    }

    @ObfuscatedName("ql.ar(B)I")
    public int method7288() {
        return this.field4757;
    }

    @ObfuscatedName("ql.bt(B)I")
    public int method7380() {
        return this.method7287() / this.field4741.field4768;
    }

    @ObfuscatedName("ql.bj(I)I")
    public int method7339() {
        return this.method7281() ? 0 : this.method7300((class435) this.field4755.get(this.field4755.size() - 1), false);
    }

    @ObfuscatedName("ql.be(I)I")
    public int method7289() {
        return this.field4748;
    }

    @ObfuscatedName("ql.bm(B)I")
    public int method7338() {
        return this.field4749;
    }

    @ObfuscatedName("ql.bo(S)I")
    public int method7293() {
        return this.field4756;
    }

    @ObfuscatedName("ql.bi(I)I")
    public int method7294() {
        return this.field4745;
    }

    @ObfuscatedName("ql.ba(IB)I")
    public int method7404(int arg0) {
        switch(this.field4752) {
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

    @ObfuscatedName("ql.bg(II)I")
    public int method7273(int arg0) {
        switch(this.field4754) {
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

    @ObfuscatedName("ql.bs(I)V")
    public void method7297() {
        this.method7298(0, this.field4755.size());
    }

    @ObfuscatedName("ql.bp(III)V")
    public void method7298(int arg0, int arg1) {
        if (this.method7281() || this.field4741 == null) {
            return;
        }
        class518 var3 = this.method7301(arg0, arg1);
        boolean var4 = (Integer) var3.field5226 == 0 && (Integer) var3.field5223 == this.field4755.size();
        int var5 = (Integer) var3.field5226;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class435) this.field4755.get((Integer) var3.field5226)).field4765;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5226; var9 <= (Integer) var3.field5223; var9++) {
            boolean var10 = var9 >= this.field4755.size();
            class435 var11 = (class435) this.field4755.get(var10 ? this.field4755.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method7300(var11, false);
            boolean var13 = !var10 && var11.field4764 == '\n';
            boolean var14 = !var10 && this.method7267() && var6 + var12 > this.field4748;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4756 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class435 var19 = (class435) this.field4755.get(var18);
                            var17 += var18 < var15 ? this.method7300(var19, false) : 0;
                            if (var19.field4764 == ' ' || var19.field4764 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method7404(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class435 var22 = (class435) this.field4755.get(var21);
                    int var23 = this.method7300(var22, false);
                    var22.field4767 = var20;
                    var22.field4765 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method7288();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4754 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method7288();
        int var25 = this.method7273(var24);
        for (int var26 = 0; var26 < this.field4755.size(); var26++) {
            class435 var27 = (class435) this.field4755.get(var26);
            var27.field4765 -= var25;
        }
    }

    @ObfuscatedName("ql.bx(II)I")
    public int method7388(int arg0) {
        return arg0 < this.field4755.size() ? this.method7300((class435) this.field4755.get(arg0), false) : 0;
    }

    @ObfuscatedName("ql.bu(Lqf;ZB)I")
    public int method7300(class435 arg0, boolean arg1) {
        if (arg0.field4764 == '\n') {
            return 0;
        } else if (arg1 || this.field4745 == 0) {
            int var3 = this.field4741.field4770[arg0.field4764];
            if (var3 == 0) {
                return arg0.field4764 == '\t' ? this.field4741.field4770[32] * 3 : this.field4741.field4770[32];
            } else {
                return var3;
            }
        } else {
            return this.field4741.field4770[42];
        }
    }

    @ObfuscatedName("ql.by(III)Ltu;")
    public class518 method7301(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4755.size();
        if (var3 == 0 && var4 == var5) {
            return new class518(0, var5);
        }
        int var6 = this.method7302(var3, false);
        int var7 = this.method7303(var4, false);
        switch(this.field4754) {
            case 0:
                if (this.field4752 == 0) {
                    return new class518(var6, var5);
                }
                int var9 = this.method7302(var3, true);
                return new class518(var9, var5);
            case 1:
                return new class518(0, var5);
            case 2:
                if (this.field4752 == 2) {
                    return new class518(0, var7);
                }
                int var8 = this.method7303(var4, true);
                return new class518(0, var8);
            default:
                return new class518(0, var5);
        }
    }

    @ObfuscatedName("ql.bw(IZI)I")
    public int method7302(int arg0, boolean arg1) {
        if (arg0 < this.field4755.size()) {
            int var3 = ((class435) this.field4755.get(arg0)).field4765;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class435) this.field4755.get(var4 - 1)).field4765 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class435) this.field4755.get(var4 - 1)).field4765;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("ql.bl(IZI)I")
    public int method7303(int arg0, boolean arg1) {
        if (arg0 < this.field4755.size()) {
            int var3 = ((class435) this.field4755.get(arg0)).field4765;
            for (int var4 = arg0; var4 < this.field4755.size() - 1; var4++) {
                if (((class435) this.field4755.get(var4 + 1)).field4765 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class435) this.field4755.get(var4 + 1)).field4765;
                }
            }
        }
        return this.field4755.size();
    }
}
