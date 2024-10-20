package deob;

import java.util.ArrayList;

@ObfuscatedName("pk")
public class class393 {

    @ObfuscatedName("pk.ag")
    public int field4424 = Integer.MAX_VALUE;

    @ObfuscatedName("pk.ar")
    public int field4422 = Integer.MAX_VALUE;

    @ObfuscatedName("pk.ah")
    public int field4419 = 0;

    @ObfuscatedName("pk.az")
    public int field4427 = 0;

    @ObfuscatedName("pk.au")
    public int field4428 = 0;

    @ObfuscatedName("pk.ai")
    public boolean field4429 = true;

    @ObfuscatedName("pk.aq")
    public class396 field4432;

    @ObfuscatedName("pk.aw")
    public ArrayList field4431 = new ArrayList();

    @ObfuscatedName("pk.ay")
    public int field4425 = 0;

    @ObfuscatedName("pk.al")
    public int field4433 = 0;

    @ObfuscatedName("pk.at(II)Lpb;")
    public class395 method6618(int arg0) {
        return (class395) this.field4431.get(arg0);
    }

    @ObfuscatedName("pk.an(I)Lpb;")
    public class395 method6619() {
        return this.field4431.size() == 0 ? null : (class395) this.field4431.get(this.field4431.size() - 1);
    }

    @ObfuscatedName("pk.av(I)Z")
    public boolean method6766() {
        return this.field4431.size() == 0;
    }

    @ObfuscatedName("pk.as(I)Z")
    public boolean method6756() {
        return this.field4422 > 1;
    }

    @ObfuscatedName("pk.ax(I)I")
    public int method6622() {
        return this.field4431.size();
    }

    @ObfuscatedName("pk.ap(B)Ljava/lang/String;")
    public String method6623() {
        if (this.method6766()) {
            return "";
        }
        StringBuilder var1 = new StringBuilder(this.method6622());
        for (int var2 = 0; var2 < this.method6622(); var2++) {
            class395 var3 = this.method6618(var2);
            var1.append(var3.field4439);
        }
        return var1.toString();
    }

    @ObfuscatedName("pk.ab(II)V")
    public void method6753(int arg0) {
        if (this.field4432 != null && arg0 < this.field4432.field4447 * 2) {
            arg0 = Integer.MAX_VALUE;
        }
        if (this.field4424 != arg0) {
            this.field4424 = arg0;
            this.method6711();
        }
    }

    @ObfuscatedName("pk.ak(II)V")
    public void method6625(int arg0) {
        if (this.field4422 != arg0) {
            this.field4422 = arg0;
            this.method6711();
        }
    }

    @ObfuscatedName("pk.ae(IB)V")
    public void method6626(int arg0) {
        if (this.field4433 != arg0) {
            this.field4433 = arg0;
            this.method6711();
        }
    }

    @ObfuscatedName("pk.af(Lpn;I)V")
    public void method6627(class396 arg0) {
        if (this.field4432 == arg0) {
            return;
        }
        this.field4432 = arg0;
        if (this.field4432 == null) {
            return;
        }
        if (this.field4428 == 0) {
            this.field4428 = this.field4432.field4447;
        }
        if (!this.method6766()) {
            this.method6711();
        }
    }

    @ObfuscatedName("pk.ao(IB)V")
    public void method6628(int arg0) {
        if (this.field4425 != arg0) {
            this.field4425 = arg0;
            this.method6711();
        }
    }

    @ObfuscatedName("pk.aa(III)Z")
    public boolean method6629(int arg0, int arg1) {
        if (this.field4419 != arg0 || this.field4427 != arg1) {
            this.field4419 = arg0;
            this.field4427 = arg1;
            this.method6711();
        }
        return true;
    }

    @ObfuscatedName("pk.aj(IB)V")
    public void method6717(int arg0) {
        if (this.field4428 != arg0) {
            this.field4428 = arg0;
            this.method6711();
        }
    }

    @ObfuscatedName("pk.ad(III)Lpw;")
    public class397 method6631(int arg0, int arg1) {
        if (arg0 == arg1) {
            return new class397(this, 0, 0);
        } else if (arg0 <= this.field4431.size() && arg1 <= this.field4431.size()) {
            return arg1 < arg0 ? new class397(this, arg1, arg0) : new class397(this, arg0, arg1);
        } else {
            return new class397(this, 0, 0);
        }
    }

    @ObfuscatedName("pk.ac(CIIB)Lpd;")
    public class394 method6632(char arg0, int arg1, int arg2) {
        return this.method6633(Character.toString(arg0), arg1, arg2);
    }

    @ObfuscatedName("pk.ag(Ljava/lang/String;III)Lpd;")
    public class394 method6633(String arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg2 = Integer.MAX_VALUE;
        }
        int var4 = arg1;
        if (this.field4431.size() >= arg2) {
            this.method6653(arg1, arg1);
            return new class394(arg1, true);
        }
        this.field4431.ensureCapacity(this.field4431.size() + arg0.length());
        for (int var5 = 0; var5 < arg0.length() && this.field4431.size() < arg2; var5++) {
            class395 var6 = new class395();
            var6.field4439 = arg0.charAt(var5);
            this.field4431.add(var4, var6);
            var4++;
        }
        this.method6653(arg1, var4);
        if (this.field4422 == 0 || this.method6675() <= this.field4422) {
            return new class394(var4, false);
        }
        while (arg1 != var4) {
            var4--;
            this.method6637(var4);
            if (this.method6675() <= this.field4422) {
                break;
            }
        }
        return new class394(var4, true);
    }

    @ObfuscatedName("pk.ar(Ljava/lang/String;II)Lpd;")
    public class394 method6634(String arg0, int arg1) {
        return this.method6633(arg0, this.field4431.size(), arg1);
    }

    @ObfuscatedName("pk.ah(Ljava/lang/String;I)Lpd;")
    public class394 method6635(String arg0) {
        this.method6636();
        return this.method6634(arg0, 0);
    }

    @ObfuscatedName("pk.az(I)V")
    public void method6636() {
        this.field4431.clear();
    }

    @ObfuscatedName("pk.au(II)I")
    public int method6637(int arg0) {
        return this.method6638(arg0, arg0 + 1);
    }

    @ObfuscatedName("pk.ai(III)I")
    public int method6638(int arg0, int arg1) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        this.field4431.subList(arg0, arg1).clear();
        int var4 = arg0;
        if (this.method6756() && this.field4425 == 1) {
            while (var4 > 0) {
                var4--;
                char var5 = ((class395) this.field4431.get(var4)).field4439;
                if (var5 == ' ' || var5 == '\t') {
                    break;
                }
            }
        }
        this.method6653(var4, arg1);
        return arg0;
    }

    @ObfuscatedName("pk.aq(III)I")
    public int method6652(int arg0, int arg1) {
        if (this.field4432 == null) {
            return 0;
        } else if (this.method6756() && arg0 > this.field4424) {
            return this.field4431.size();
        } else {
            if (!this.field4431.isEmpty()) {
                for (int var3 = 0; var3 < this.field4431.size(); var3++) {
                    class395 var4 = (class395) this.field4431.get(var3);
                    if (arg1 <= var4.field4441 + this.method6643()) {
                        if (arg1 < var4.field4441) {
                            break;
                        }
                        if (arg0 < var4.field4442) {
                            return var3 > 0 ? var3 - 1 : 0;
                        }
                        if (var3 + 1 != this.field4431.size() && ((class395) this.field4431.get(var3 + 1)).field4441 != var4.field4441) {
                            int var5 = this.method6647((class395) this.field4431.get(var3), false);
                            if (arg0 < var4.field4442 + var5) {
                                return var3;
                            }
                            if (arg1 <= var4.field4441 + this.method6643()) {
                                return var3 + 1;
                            }
                        }
                    }
                }
                class395 var6 = (class395) this.field4431.get(this.field4431.size() - 1);
                if (arg0 >= var6.field4442 && arg0 <= var6.field4442 + this.method6642() && arg1 >= var6.field4441 && arg1 <= var6.field4441 + this.method6643()) {
                    return this.field4431.size() - 1;
                }
            }
            return this.field4431.size();
        }
    }

    @ObfuscatedName("pk.aw(IIB)I")
    public int method6645(int arg0, int arg1) {
        if (this.field4432 == null || this.method6766() || arg0 > this.field4431.size()) {
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
            class395 var6 = (class395) this.field4431.get(arg0 - 1);
            var4 = var6.field4442 + this.method6648(arg0 - 1);
            var5 = var6.field4441;
        } else if (var3 == -1 && arg0 == 0) {
            return 0;
        }
        int var7 = 16777215;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 16777215;
        int var11 = var3 == 1 ? this.field4431.size() + 1 : 0;
        for (int var12 = arg0 + var3; var12 != var11; var12 += var3) {
            class395 var13 = (class395) this.field4431.get(var12 - 1);
            if (var13.field4441 != var5) {
                var8++;
                var5 = var13.field4441;
                if (var8 > arg1) {
                    return var9;
                }
            }
            if (arg1 == var8) {
                int var14 = Math.abs(var13.field4442 + this.method6648(var12 - 1) - var4);
                if (var14 >= var10) {
                    return var9;
                }
                var9 = var12;
                var10 = var14;
            }
        }
        if (var3 == 1) {
            return this.field4431.size();
        } else {
            if (var5 != 0) {
                var8++;
            }
            return var10 == 16777215 || arg1 == var8 && var4 < var10 ? 0 : var9;
        }
    }

    @ObfuscatedName("pk.ay(I)I")
    public int method6641() {
        if (!this.field4431.isEmpty() && this.method6675() == 1) {
            return this.field4431.isEmpty() ? 0 : ((class395) this.field4431.get(this.field4431.size() - 1)).field4442 + this.method6642();
        }
        int var1 = -1;
        int var2 = 0;
        for (int var3 = this.field4431.size() - 1; var3 >= 0; var3--) {
            class395 var4 = (class395) this.field4431.get(var3);
            if (var4.field4441 != var1) {
                int var5 = this.method6647(var4, false) + var4.field4442;
                var2 = Math.max(var5, var2);
                var1 = var4.field4441;
            }
        }
        return var2;
    }

    @ObfuscatedName("pk.al(I)I")
    public int method6644() {
        return this.method6766() ? 0 : this.field4432.field4447 + ((class395) this.field4431.get(this.field4431.size() - 1)).field4441;
    }

    @ObfuscatedName("pk.am(I)I")
    public int method6643() {
        return this.field4428;
    }

    @ObfuscatedName("pk.bs(B)I")
    public int method6675() {
        return this.method6644() / this.field4432.field4447;
    }

    @ObfuscatedName("pk.bc(I)I")
    public int method6642() {
        return this.method6766() ? 0 : this.method6647((class395) this.field4431.get(this.field4431.size() - 1), false);
    }

    @ObfuscatedName("pk.bj(I)I")
    public int method6646() {
        return this.field4424;
    }

    @ObfuscatedName("pk.bo(I)I")
    public int method6655() {
        return this.field4422;
    }

    @ObfuscatedName("pk.bq(I)I")
    public int method6661() {
        return this.field4425;
    }

    @ObfuscatedName("pk.bg(B)I")
    public int method6734() {
        return this.field4433;
    }

    @ObfuscatedName("pk.bf(II)I")
    public int method6650(int arg0) {
        switch(this.field4419) {
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

    @ObfuscatedName("pk.bd(II)I")
    public int method6681(int arg0) {
        switch(this.field4427) {
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

    @ObfuscatedName("pk.ba(I)V")
    public void method6711() {
        this.method6653(0, this.field4431.size());
    }

    @ObfuscatedName("pk.bn(III)V")
    public void method6653(int arg0, int arg1) {
        if (this.method6766() || this.field4432 == null) {
            return;
        }
        class474 var3 = this.method6656(arg0, arg1);
        boolean var4 = (Integer) var3.field4904 == 0 && (Integer) var3.field4905 == this.field4431.size();
        int var5 = (Integer) var3.field4904;
        int var6 = 0;
        int var7 = var4 ? 0 : ((class395) this.field4431.get((Integer) var3.field4904)).field4441;
        int var8 = 0;
        for (int var9 = (Integer) var3.field4904; var9 <= (Integer) var3.field4905; var9++) {
            boolean var10 = var9 >= this.field4431.size();
            class395 var11 = (class395) this.field4431.get(var10 ? this.field4431.size() - 1 : var9);
            int var12 = var10 ? 0 : this.method6647(var11, false);
            boolean var13 = !var10 && var11.field4439 == '\n';
            boolean var14 = !var10 && this.method6756() && var6 + var12 > this.field4424;
            if (var13 || var14 || var10) {
                int var15 = var9;
                int var16 = 0;
                if (var14) {
                    int var17 = 0;
                    if (this.field4425 == 1) {
                        for (int var18 = var9; var18 > var5; var18--) {
                            class395 var19 = (class395) this.field4431.get(var18);
                            var17 += var18 < var15 ? this.method6647(var19, false) : 0;
                            if (var19.field4439 == ' ' || var19.field4439 == '\n') {
                                var15 = var18;
                                var6 -= var17;
                                var16 = var17;
                                break;
                            }
                        }
                    }
                }
                int var20 = -this.method6650(var6);
                for (int var21 = var5; var21 < var15; var21++) {
                    class395 var22 = (class395) this.field4431.get(var21);
                    int var23 = this.method6647(var22, false);
                    var22.field4442 = var20;
                    var22.field4441 = var7;
                    var20 += var23;
                }
                var5 = var15;
                var6 = var16;
                var7 += this.method6643();
                var8++;
            }
            var6 += var10 ? 0 : var12;
        }
        if (this.field4427 == 0 || !var4) {
            return;
        }
        int var24 = var8 * this.method6643();
        int var25 = this.method6681(var24);
        for (int var26 = 0; var26 < this.field4431.size(); var26++) {
            class395 var27 = (class395) this.field4431.get(var26);
            var27.field4441 -= var25;
        }
    }

    @ObfuscatedName("pk.bb(II)I")
    public int method6648(int arg0) {
        return arg0 < this.field4431.size() ? this.method6647((class395) this.field4431.get(arg0), false) : 0;
    }

    @ObfuscatedName("pk.bx(Lpb;ZB)I")
    public int method6647(class395 arg0, boolean arg1) {
        if (arg0.field4439 == '\n') {
            return 0;
        } else if (arg1 || this.field4433 == 0) {
            int var3 = this.field4432.field4458[arg0.field4439];
            if (var3 == 0) {
                return arg0.field4439 == '\t' ? this.field4432.field4458[32] * 3 : this.field4432.field4458[32];
            } else {
                return var3;
            }
        } else {
            return this.field4432.field4458[42];
        }
    }

    @ObfuscatedName("pk.be(III)Lsf;")
    public class474 method6656(int arg0, int arg1) {
        int var3 = Math.min(arg0, arg1);
        int var4 = Math.max(arg0, arg1);
        int var5 = this.field4431.size();
        if (var3 == 0 && var4 == var5) {
            return new class474(0, var5);
        }
        int var6 = this.method6639(var3, false);
        int var7 = this.method6762(var4, false);
        switch(this.field4427) {
            case 0:
                if (this.field4419 == 0) {
                    return new class474(var6, var5);
                }
                int var9 = this.method6639(var3, true);
                return new class474(var9, var5);
            case 1:
                return new class474(0, var5);
            case 2:
                if (this.field4419 == 2) {
                    return new class474(0, var7);
                }
                int var8 = this.method6762(var4, true);
                return new class474(0, var8);
            default:
                return new class474(0, var5);
        }
    }

    @ObfuscatedName("pk.bh(IZB)I")
    public int method6639(int arg0, boolean arg1) {
        if (arg0 < this.field4431.size()) {
            int var3 = ((class395) this.field4431.get(arg0)).field4441;
            for (int var4 = arg0; var4 > 0; var4--) {
                if (((class395) this.field4431.get(var4 - 1)).field4441 < var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class395) this.field4431.get(var4 - 1)).field4441;
                }
            }
        }
        return 0;
    }

    @ObfuscatedName("pk.bp(IZB)I")
    public int method6762(int arg0, boolean arg1) {
        if (arg0 < this.field4431.size()) {
            int var3 = ((class395) this.field4431.get(arg0)).field4441;
            for (int var4 = arg0; var4 < this.field4431.size() - 1; var4++) {
                if (((class395) this.field4431.get(var4 + 1)).field4441 > var3) {
                    if (!arg1) {
                        return var4;
                    }
                    arg1 = false;
                    var3 = ((class395) this.field4431.get(var4 + 1)).field4441;
                }
            }
        }
        return this.field4431.size();
    }
}
