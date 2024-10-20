package deob;

import java.util.ArrayList;

@ObfuscatedName("qn")
public class class436 {

    @ObfuscatedName("qn.az")
    public int field4779 = Integer.MAX_VALUE;

    @ObfuscatedName("qn.aa")
    public int field4781 = Integer.MAX_VALUE;

    @ObfuscatedName("qn.ai")
    public int field4782 = 0;

    @ObfuscatedName("qn.ao")
    public int field4783 = 0;

    @ObfuscatedName("qn.as")
    public int field4784 = 0;

    @ObfuscatedName("qn.ay")
    public boolean field4785 = true;

    @ObfuscatedName("qn.aj")
    public class439 field4786;

    @ObfuscatedName("qn.av")
    public ArrayList field4787 = new ArrayList();

    @ObfuscatedName("qn.aw")
    public int field4788 = 0;

    @ObfuscatedName("qn.an")
    public int field4789 = 0;

    @ObfuscatedName("qn.ac(II)Lqe;")
    public class438 method7511(int arg0) {
        return (class438) this.field4787.get(arg0);
    }

    @ObfuscatedName("qn.ae(B)Lqe;")
    public class438 method7617() {
        return this.field4787.size() == 0 ? null : (class438) this.field4787.get(this.field4787.size() - 1);
    }

    @ObfuscatedName("qn.ag(I)Z")
    public boolean method7513() {
        return this.field4787.size() == 0;
    }

    @ObfuscatedName("qn.am(B)Z")
    public boolean method7585() {
        return this.field4781 > 1;
    }

    @ObfuscatedName("qn.ax(I)I")
    public int method7577() {
        return this.field4787.size();
    }

    @ObfuscatedName("qn.aq(I)Ljava/lang/String;")
    public String method7599() {
        if (this.method7513()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method7577());
        for (int var2 = 0; var2 < this.method7577(); var2++) {
            class438 var3 = this.method7511(var2);
            var1.append(var3.field4795);
        }
        return var1.toString();
    }

    @ObfuscatedName("qn.af(II)V")
    public void method7516(int arg0) {
        if (this.field4786 != null && arg0 < this.field4786.field4804 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4779 != arg0) {
            this.field4779 = arg0;
            this.method7590();
        }
    }

    @ObfuscatedName("qn.at(IB)V")
    public void method7517(int arg0) {
        if (this.field4781 != arg0) {
            this.field4781 = arg0;
            this.method7590();
        }
    }

    @ObfuscatedName("qn.au(II)V")
    public void method7541(int arg0) {
        if (this.field4789 != arg0) {
            this.field4789 = arg0;
            this.method7590();
        }
    }

    @ObfuscatedName("qn.ar(Lqk;I)V")
    public void method7519(class439 arg0) {
        if (this.field4786 == arg0) {
            return;
        }
        this.field4786 = arg0;
        if (this.field4786 == null) {
            return;
        }
        if (this.field4784 == 0) {
            this.field4784 = this.field4786.field4804;
        }
        if (!this.method7513()) {
            this.method7590();
        }
    }

    @ObfuscatedName("qn.al(II)V")
    public void method7520(int arg0) {
        if (this.field4788 != arg0) {
            this.field4788 = arg0;
            this.method7590();
        }
    }

    @ObfuscatedName("qn.ad(III)Z")
    public boolean method7521(int arg0, int arg1) {
        if (this.field4782 != arg0 || this.field4783 != arg1) {
            this.field4782 = arg0;
            this.field4783 = arg1;
            this.method7590();
        }
        return true;
    }

    @ObfuscatedName("qn.ah(II)V")
    public void method7522(int arg0) {
        if (this.field4784 != arg0) {
            this.field4784 = arg0;
            this.method7590();
        }
    }

    @ObfuscatedName("qn.ap(IIB)Lqw;")
    public class440 method7523(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class440(this, 0, 0);
        } else if (arg0 <= this.field4787.size() && arg1 <= this.field4787.size()) {
            return arg1 < arg0 ? new class440(this, arg1, arg0) : new class440(this, arg0, arg1);
        } else {
            return new class440(this, 0, 0);
        }
    }

    @ObfuscatedName("qn.ab(CIII)Lqc;")
    public class437 method7524(char arg0, int arg1, int arg2) {
        return this.method7589(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("qn.az(Ljava/lang/String;IIB)Lqc;")
    public class437 method7589(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4787.size() >= arg2) {
            this.method7535(arg1, arg1);
            return new class437(arg1, true);
        }
        this.field4787.ensureCapacity(this.field4787.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4787.size() < arg2; var5++) {
            class438 var6 = new class438();
            var6.field4795 = arg0.charAt(var5);
            this.field4787.add(var4, var6);
            var4++;
        }
        this.method7535(arg1, var4);
        if (this.field4781 == 0 || this.method7515() <= this.field4781) {
            return new class437(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method7544(var4);
            if (this.method7515() <= this.field4781) {
                break;
            }
        }
        return new class437(var4, true);
    }

    @ObfuscatedName("qn.aa(Ljava/lang/String;II)Lqc;")
    public class437 method7526(String arg0, int arg1) {
        return this.method7589(arg0, this.field4787.size(), arg1);
    }

    @ObfuscatedName("qn.ai(Ljava/lang/String;S)Lqc;")
    public class437 method7582(String arg0) {
        this.method7528();
        return this.method7526(arg0, 0);
    }

    @ObfuscatedName("qn.ao(I)V")
    public void method7528() {
        this.field4787.clear();
    }

    @ObfuscatedName("qn.as(IB)I")
    public int method7544(int arg0) {
        return this.method7628(arg0, arg0 + 1);
    }

    @ObfuscatedName("qn.ay(IIS)I")
    public int method7628(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4787.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method7585() && this.field4788 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class438) this.field4787.get(var4)).field4795;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method7535(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("qn.aj(III)I")
    public int method7531(int arg0, int arg1) {
        if (this.field4786 == null) {
            return 0;
        } else if (this.method7585() && arg0 > this.field4779) {
            return this.field4787.size();
        } else {
            if (!this.field4787.isEmpty()) {
                for (int var3 = 0; var3 < this.field4787.size(); var3++) {
                    class438 var4 = (class438) this.field4787.get(var3);
                    if (arg1 <= var4.field4796 + this.method7572()) {
                        if (arg1 < var4.field4796) {
                            break;
                        }
                        if (arg0 < var4.field4794) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4787.size() && ((class438) this.field4787.get(var3 + 1)).field4796 != var4.field4796) {
                            int var5 = this.method7547((class438) this.field4787.get(var3), false);
                            if (arg0 < var4.field4794 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4796 + this.method7572()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class438 var6 = (class438) this.field4787.get(this.field4787.size() - 1);
                if (arg0 >= var6.field4794 && arg0 <= var6.field4794 + this.method7512() && arg1 >= var6.field4796 && arg1 <= var6.field4796 + this.method7572()) {
                    return this.field4787.size() - 1;
                }
            }
            return this.field4787.size();
        }
    }

    @ObfuscatedName("qn.av(III)I")
    public int method7532(int arg0, int arg1) {
        if (this.field4786 == null || this.method7513() || arg0 > this.field4787.size()) {
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
            class438 var6 = (class438) this.field4787.get(arg0 - 1);
            var4 = var6.field4794 + this.method7546(arg0 - 1);
            var5 = var6.field4796;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4787.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class438 var13 = (class438) this.field4787.get(var12 - 1);
            if (var13.field4796 != var5) {
                var8++;
                var5 = var13.field4796;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4794 + this.method7546(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4787.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("qn.aw(I)I")
    public int method7533() {
        if (!this.field4787.isEmpty() && this.method7515() == 1) {
            return this.field4787.isEmpty() ? 0 : ((class438) this.field4787.get(this.field4787.size() - 1)).field4794 + this.method7512();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4787.size() - 1; var3 >= 0; var3--) {
            class438 var4 = (class438) this.field4787.get(var3);
            if (var4.field4796 != var1) {
                int var5 = this.method7547(var4, false) + var4.field4794;
                var2 = Math.max(var5, var2);
                var1 = var4.field4796;
            }
        }
        return var2;
    }

    @ObfuscatedName("qn.an(I)I")
    public int method7534() {
        return this.method7513() ? 0 : this.field4786.field4804 + ((class438) this.field4787.get(this.field4787.size() - 1)).field4796;
    }

    @ObfuscatedName("qn.ak(B)I")
    public int method7572() {
        return this.field4784;
    }

    @ObfuscatedName("qn.bn(B)I")
    public int method7515() {
        return this.method7534() / this.field4786.field4804;
    }

    @ObfuscatedName("qn.bh(I)I")
    public int method7512() {
        return this.method7513() ? 0 : this.method7547((class438) this.field4787.get(this.field4787.size() - 1), false);
    }

    @ObfuscatedName("qn.bd(B)I")
    public int method7538() {
        return this.field4779;
    }

    @ObfuscatedName("qn.bx(I)I")
    public int method7539() {
        return this.field4781;
    }

    @ObfuscatedName("qn.bf(S)I")
    public int method7540() {
        return this.field4788;
    }

    @ObfuscatedName("qn.bm(B)I")
    public int method7552() {
        return this.field4789;
    }

    @ObfuscatedName("qn.bs(IB)I")
    public int method7542(int arg0) {
        switch(this.field4782) {
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

    @ObfuscatedName("qn.bw(IB)I")
    public int method7543(int arg0) {
        switch(this.field4783) {
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

    @ObfuscatedName("qn.ba(I)V")
    public void method7590() {
        this.method7535(0, this.field4787.size());
    }

    @ObfuscatedName("qn.bj(IIB)V")
    public void method7535(int arg0, int arg1) {
        if (this.method7513() || this.field4786 == null) {
            return;
        }
        class521 var3 = this.method7548(arg0, arg1);
        boolean var4 = (Integer) var3.field5265 == 0 && (Integer) var3.field5266 == this.field4787.size();
        int var5 = (Integer) var3.field5265;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class438) this.field4787.get((Integer) var3.field5265)).field4796;
        int var8 = 0;
        for (int var9 = (Integer) var3.field5265; var9 <= (Integer) var3.field5266; var9++) {
            boolean var10 = var9 >= this.field4787.size();
            class438 var11 = (class438) this.field4787.get(var10 ? this.field4787.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method7547(var11, false);
            boolean var13 = !var10 && var11.field4795 == '\n';
            boolean var14 = !var10 && this.method7585() && var6 + var12 > this.field4779;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4788 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class438 var19 = (class438) this.field4787.get(var18);
                            var17 += var18 < var15 ? this.method7547(var19, false) : 0;
                            if (var19.field4795 == ' ' || var19.field4795 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method7542(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class438 var22 = (class438) this.field4787.get(var21);
                    int var23 = this.method7547(var22, false);
                    var22.field4794 = var20;
                    var22.field4796 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method7572();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4783 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method7572();
        int var25 = this.method7543(var24);
        for (int var26 = 0; var26 < this.field4787.size(); var26++) {
            class438 var27 = (class438) this.field4787.get(var26);
            var27.field4796 -= var25;
        }
    }

    @ObfuscatedName("qn.bp(II)I")
    public int method7546(int arg0) {
        return arg0 < this.field4787.size() ? this.method7547((class438) this.field4787.get(arg0), false) : 0;
    }

    @ObfuscatedName("qn.by(Lqe;ZI)I")
    public int method7547(class438 arg0, boolean arg1) {
        if (arg0.field4795 == '\n') {
            return 0;
        } else if (arg1 || this.field4789 == 0) {
            int var3 = this.field4786.field4799[arg0.field4795];
            if (var3 == 0) {
                return arg0.field4795 == '\t' ? this.field4786.field4799[32] * 3 : this.field4786.field4799[32];
            } else {
                return var3;
            }
        } else {
            return this.field4786.field4799[42];
        }
    }

    @ObfuscatedName("qn.bb(III)Lue;")
    public class521 method7548(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4787.size();
        if (var3 == 0 && var4 == var5) {
            return new class521(0, var5);
        }
        int var6 = this.method7549(var3, false);
        int var7 = this.method7550(var4, false);
        switch(this.field4783) {
            case 0:
                if (this.field4782 == 0) {
                    return new class521(var6, var5);
                }
                int var9 = this.method7549(var3, true);
                return new class521(var9, var5);
            case 1:
                return new class521(0, var5);
            case 2:
                if (this.field4782 == 2) {
                    return new class521(0, var7);
                }
                int var8 = this.method7550(var4, true);
                return new class521(0, var8);
            default:
                return new class521(0, var5);
        }
    }

    @ObfuscatedName("qn.bi(IZI)I")
    public int method7549(int arg0, boolean arg1) {
        if (arg0 < this.field4787.size()) {
            int var3 = ((class438) this.field4787.get(arg0)).field4796;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class438) this.field4787.get(var4 - 1)).field4796 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class438) this.field4787.get(var4 - 1)).field4796;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("qn.bg(IZI)I")
    public int method7550(int arg0, boolean arg1) {
        if (arg0 < this.field4787.size()) {
            int var3 = ((class438) this.field4787.get(arg0)).field4796;
            for (int var4 = arg0; var4 < this.field4787.size() - 1; var4++) {
                if (((class438) this.field4787.get(var4 + 1)).field4796 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class438) this.field4787.get(var4 + 1)).field4796;
                }
            }
        }
        return this.field4787.size();
    }
}
