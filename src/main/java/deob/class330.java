package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("mb")
public class class330 {

    @ObfuscatedName("mb.am")
    public class395 field3600 = new class395();

    @ObfuscatedName("mb.ax")
    public class395 field3589 = new class395();

    @ObfuscatedName("mb.ah")
    public boolean field3613 = false;

    @ObfuscatedName("mb.as")
    public boolean field3601 = true;

    @ObfuscatedName("mb.ay")
    public int field3598 = 0;

    @ObfuscatedName("mb.aj")
    public boolean field3603 = false;

    @ObfuscatedName("mb.av")
    public int field3604 = 0;

    @ObfuscatedName("mb.aw")
    public int field3618 = 0;

    @ObfuscatedName("mb.ak")
    public int field3606 = 0;

    @ObfuscatedName("mb.bh")
    public int field3608 = 0;

    @ObfuscatedName("mb.bj")
    public int field3607 = 0;

    @ObfuscatedName("mb.bk")
    public int field3609 = 0;

    @ObfuscatedName("mb.bv")
    public int field3610 = 0;

    @ObfuscatedName("mb.bt")
    public int field3599 = Integer.MAX_VALUE;

    @ObfuscatedName("mb.bd")
    public int field3616 = Integer.MAX_VALUE;

    @ObfuscatedName("mb.by")
    public int field3605 = 0;

    @ObfuscatedName("mb.bs")
    public int field3614 = 0;

    @ObfuscatedName("mb.bm")
    public int field3615 = 0;

    @ObfuscatedName("mb.bf")
    public int field3602 = 0;

    @ObfuscatedName("mb.bq")
    public class324 field3617;

    @ObfuscatedName("mb.ba")
    public class324 field3612;

    public class330() {
        this.field3600.method6764(1);
        this.field3589.method6764(1);
    }

    @ObfuscatedName("mb.au(B)V")
    public void method5561() {
        this.field3598 = (this.field3598 + 1) % 60;
        if (this.field3610 > 0) {
            this.field3610--;
        }
    }

    @ObfuscatedName("mb.ae(ZI)Z")
    public boolean method5562(boolean arg0) {
        boolean var2 = arg0 && this.field3601;
        boolean var3 = this.field3613 != var2;
        this.field3613 = var2;
        if (!this.field3613) {
            this.method5586(this.field3608, this.field3608);
        }
        return var3;
    }

    @ObfuscatedName("mb.ao(ZI)V")
    public void method5599(boolean arg0) {
        this.field3601 = arg0;
        this.field3613 = arg0 && this.field3613;
    }

    @ObfuscatedName("mb.at(Ljava/lang/String;I)Z")
    public boolean method5746(String arg0) {
        String var2 = this.field3600.method6696();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5621(arg0);
        this.field3600.method6772(var3);
        this.method5571(this.field3615, this.field3602);
        this.method5634();
        this.method5639();
        return true;
    }

    @ObfuscatedName("mb.ac(Ljava/lang/String;B)Z")
    public boolean method5565(String arg0) {
        this.field3589.method6772(arg0);
        return true;
    }

    @ObfuscatedName("mb.ai(Lpk;B)Z")
    public boolean method5566(class398 arg0) {
        boolean var2 = !this.field3603;
        this.field3600.method6700(arg0);
        this.field3589.method6700(arg0);
        this.field3603 = true;
        boolean var3 = var2 | this.method5571(this.field3615, this.field3602);
        boolean var4 = var3 | this.method5586(this.field3607, this.field3608);
        if (this.method5634()) {
            this.method5639();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("mb.az(IIB)Z")
    public boolean method5567(int arg0, int arg1) {
        boolean var3 = this.field3605 != arg0 || this.field3614 != arg1;
        this.field3605 = arg0;
        this.field3614 = arg1;
        return var3 | this.method5571(this.field3615, this.field3602);
    }

    @ObfuscatedName("mb.ap(II)Z")
    public boolean method5568(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3600.method6817();
        this.field3600.method6742(arg0);
        this.field3589.method6742(arg0);
        if (this.method5634()) {
            this.method5639();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("mb.aa(II)Z")
    public boolean method5569(int arg0) {
        this.field3600.method6694(arg0);
        if (this.method5634()) {
            this.method5639();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mb.af(IB)Z")
    public boolean method5778(int arg0) {
        this.field3616 = arg0;
        if (this.method5634()) {
            this.method5639();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mb.ad(III)Z")
    public boolean method5571(int arg0, int arg1) {
        if (!this.method5618()) {
            this.field3615 = arg0;
            this.field3602 = arg1;
            return false;
        }
        int var3 = this.field3615;
        int var4 = this.field3602;
        int var5 = Math.max(0, this.field3600.method6714() - this.field3605 + 2);
        int var6 = Math.max(0, this.field3600.method6715() - this.field3614 + 1);
        this.field3615 = Math.max(0, Math.min(var5, arg0));
        this.field3602 = Math.max(0, Math.min(var6, arg1));
        return this.field3615 != var3 || this.field3602 != var4;
    }

    @ObfuscatedName("mb.aq(IIS)Z")
    public boolean method5723(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3600.method6702(arg0, arg1) : false;
    }

    @ObfuscatedName("mb.al(IB)V")
    public void method5573(int arg0) {
        this.field3600.method6703(arg0);
    }

    @ObfuscatedName("mb.an(II)V")
    public void method5574(int arg0) {
        this.field3604 = arg0;
    }

    @ObfuscatedName("mb.ar(II)V")
    public void method5834(int arg0) {
        this.field3600.method6764(arg0);
    }

    @ObfuscatedName("mb.ab(IB)V")
    public void method5832(int arg0) {
        this.field3600.method6699(arg0);
    }

    @ObfuscatedName("mb.ag(II)Z")
    public boolean method5657(int arg0) {
        this.field3606 = arg0;
        String var2 = this.field3600.method6696();
        int var3 = var2.length();
        String var4 = this.method5621(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3600.method6772(var4);
        this.method5571(this.field3615, this.field3602);
        this.method5634();
        this.method5639();
        return true;
    }

    @ObfuscatedName("mb.am(I)V")
    public void method5578() {
        this.field3603 = false;
    }

    @ObfuscatedName("mb.ax(IB)Z")
    public boolean method5655(int arg0) {
        if (this.method5628(arg0)) {
            this.method5584();
            class396 var2 = this.field3600.method6760((char) arg0, this.field3608, this.field3599);
            this.method5586(var2.method6833(), var2.method6833());
            this.method5634();
            this.method5639();
        }
        return true;
    }

    @ObfuscatedName("mb.ah(I)V")
    public void method5580() {
        if (!this.method5584() && this.field3608 > 0) {
            int var1 = this.field3600.method6710(this.field3608 - 1);
            this.method5639();
            this.method5586(var1, var1);
        }
    }

    @ObfuscatedName("mb.as(B)V")
    public void method5581() {
        if (!this.method5584() && this.field3608 < this.field3600.method6695()) {
            int var1 = this.field3600.method6710(this.field3608);
            this.method5639();
            this.method5586(var1, var1);
        }
    }

    @ObfuscatedName("mb.ay(B)V")
    public void method5582() {
        if (!this.method5584() && this.field3608 > 0) {
            class486 var1 = this.method5632(this.field3608 - 1);
            int var2 = this.field3600.method6711((Integer) var1.field4967, this.field3608);
            this.method5639();
            this.method5586(var2, var2);
        }
    }

    @ObfuscatedName("mb.aj(B)V")
    public void method5612() {
        if (!this.method5584() && this.field3608 < this.field3600.method6695()) {
            class486 var1 = this.method5632(this.field3608);
            int var2 = this.field3600.method6711(this.field3608, (Integer) var1.field4966);
            this.method5639();
            this.method5586(var2, var2);
        }
    }

    @ObfuscatedName("mb.av(I)Z")
    public boolean method5584() {
        if (this.method5629()) {
            int var1 = this.field3600.method6711(this.field3607, this.field3608);
            this.method5639();
            this.method5586(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("mb.aw(B)V")
    public void method5826() {
        this.method5586(0, this.field3600.method6695());
    }

    @ObfuscatedName("mb.ak(III)Z")
    public boolean method5586(int arg0, int arg1) {
        if (!this.method5618()) {
            this.field3607 = arg0;
            this.field3608 = arg1;
            return false;
        }
        if (arg0 > this.field3600.method6695()) {
            arg0 = this.field3600.method6695();
        }
        if (arg1 > this.field3600.method6695()) {
            arg1 = this.field3600.method6695();
        }
        boolean var3 = this.field3607 != arg0 || this.field3608 != arg1;
        this.field3607 = arg0;
        if (this.field3608 != arg1) {
            this.field3608 = arg1;
            this.field3598 = 0;
            this.method5637();
        }
        if (var3 && this.field3612 != null) {
            this.field3612.method2568();
        }
        return var3;
    }

    @ObfuscatedName("mb.bh(ZB)V")
    public void method5587(boolean arg0) {
        class486 var2 = this.method5633(this.field3608);
        this.method5635((Integer) var2.field4967, arg0);
    }

    @ObfuscatedName("mb.bj(ZB)V")
    public void method5588(boolean arg0) {
        class486 var2 = this.method5633(this.field3608);
        this.method5635((Integer) var2.field4966, arg0);
    }

    @ObfuscatedName("mb.bk(ZB)V")
    public void method5589(boolean arg0) {
        this.method5635(0, arg0);
    }

    @ObfuscatedName("mb.bv(ZI)V")
    public void method5590(boolean arg0) {
        this.method5635(this.field3600.method6695(), arg0);
    }

    @ObfuscatedName("mb.bt(ZI)V")
    public void method5760(boolean arg0) {
        if (this.method5629() && !arg0) {
            this.method5635(Math.min(this.field3607, this.field3608), arg0);
        } else if (this.field3608 > 0) {
            this.method5635(this.field3608 - 1, arg0);
        }
    }

    @ObfuscatedName("mb.bd(ZI)V")
    public void method5592(boolean arg0) {
        if (this.method5629() && !arg0) {
            this.method5635(Math.max(this.field3607, this.field3608), arg0);
        } else if (this.field3608 < this.field3600.method6695()) {
            this.method5635(this.field3608 + 1, arg0);
        }
    }

    @ObfuscatedName("mb.by(ZS)V")
    public void method5593(boolean arg0) {
        if (this.field3608 > 0) {
            class486 var2 = this.method5632(this.field3608 - 1);
            this.method5635((Integer) var2.field4967, arg0);
        }
    }

    @ObfuscatedName("mb.bs(ZI)V")
    public void method5594(boolean arg0) {
        if (this.field3608 < this.field3600.method6695()) {
            class486 var2 = this.method5632(this.field3608 + 1);
            this.method5635((Integer) var2.field4966, arg0);
        }
    }

    @ObfuscatedName("mb.bm(ZI)V")
    public void method5595(boolean arg0) {
        if (this.field3608 > 0) {
            this.method5635(this.field3600.method6713(this.field3608, -1), arg0);
        }
    }

    @ObfuscatedName("mb.bf(ZI)V")
    public void method5596(boolean arg0) {
        if (this.field3608 < this.field3600.method6695()) {
            this.method5635(this.field3600.method6713(this.field3608, 1), arg0);
        }
    }

    @ObfuscatedName("mb.bq(ZB)V")
    public void method5597(boolean arg0) {
        if (this.field3608 > 0) {
            int var2 = this.method5636();
            this.method5635(this.field3600.method6713(this.field3608, -var2), arg0);
        }
    }

    @ObfuscatedName("mb.ba(ZI)V")
    public void method5583(boolean arg0) {
        if (this.field3608 < this.field3600.method6695()) {
            int var2 = this.method5636();
            this.method5635(this.field3600.method6713(this.field3608, var2), arg0);
        }
    }

    @ObfuscatedName("mb.bl(ZS)V")
    public void method5736(boolean arg0) {
        class399 var2 = this.field3600.method6704(0, this.field3608);
        class486 var3 = var2.method6959();
        this.method5635(this.field3600.method6741((Integer) var3.field4967, this.field3602), arg0);
    }

    @ObfuscatedName("mb.bp(ZI)V")
    public void method5734(boolean arg0) {
        class399 var2 = this.field3600.method6704(0, this.field3608);
        class486 var3 = var2.method6959();
        this.method5635(this.field3600.method6741((Integer) var3.field4967, this.field3614 + this.field3602), arg0);
    }

    @ObfuscatedName("mb.bu(IIZZI)V")
    public void method5803(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3603) {
            int var7 = this.field3615 + arg0;
            int var8 = this.field3602 + arg1;
            class486 var9 = this.method5641();
            var6 = this.field3600.method6741(var7 - (Integer) var9.field4967, var8 - (Integer) var9.field4966);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3618 = 1;
            class486 var10 = this.method5632(var6);
            class486 var11 = this.method5632(this.field3609);
            this.method5631(var11, var10);
        } else if (arg2) {
            this.field3618 = 1;
            class486 var12 = this.method5632(var6);
            this.method5586((Integer) var12.field4967, (Integer) var12.field4966);
            this.field3609 = (Integer) var12.field4967;
        } else if (arg3) {
            this.method5586(this.field3609, var6);
        } else {
            if (this.field3610 <= 0 || this.field3609 != var6) {
                this.field3618 = 0;
                this.method5586(var6, var6);
                this.field3609 = var6;
            } else if (this.field3608 == this.field3607) {
                this.field3618 = 1;
                class486 var13 = this.method5632(var6);
                this.method5586((Integer) var13.field4967, (Integer) var13.field4966);
            } else {
                this.field3618 = 2;
                class486 var14 = this.method5633(var6);
                this.method5586((Integer) var14.field4967, (Integer) var14.field4966);
            }
            this.field3610 = 25;
        }
    }

    @ObfuscatedName("mb.bo(IIB)V")
    public void method5646(int arg0, int arg1) {
        if (!this.field3603 || !this.method5613()) {
            return;
        }
        int var3 = this.field3615 + arg0;
        int var4 = this.field3602 + arg1;
        class486 var5 = this.method5641();
        int var6 = this.field3600.method6741(var3 - (Integer) var5.field4967, var4 - (Integer) var5.field4966);
        switch(this.field3618) {
            case 0:
                this.method5586(this.field3607, var6);
                break;
            case 1:
                class486 var9 = this.method5632(this.field3609);
                class486 var10 = this.method5632(var6);
                this.method5631(var9, var10);
                break;
            case 2:
                class486 var7 = this.method5633(this.field3609);
                class486 var8 = this.method5633(var6);
                this.method5631(var7, var8);
        }
    }

    @ObfuscatedName("mb.bb(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5603(Clipboard arg0) {
        class399 var2 = this.field3600.method6704(this.field3607, this.field3608);
        if (!var2.method6950()) {
            String var3 = var2.method6948();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("mb.br(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5564(Clipboard arg0) {
        if (this.method5629()) {
            this.method5603(arg0);
            this.method5584();
        }
    }

    @ObfuscatedName("mb.be(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5605(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5621((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5584();
            class396 var4 = this.field3600.method6706(var3, this.field3608, this.field3599);
            this.method5586(var4.method6833(), var4.method6833());
            this.method5634();
            this.method5639();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("mb.bi(B)V")
    public void method5764() {
        this.field3602 = Math.max(0, this.field3602 - this.field3600.method6716());
    }

    @ObfuscatedName("mb.bz(B)V")
    public void method5607() {
        int var1 = Math.max(0, this.field3600.method6715() - this.field3614);
        this.field3602 = Math.min(var1, this.field3602 + this.field3600.method6716());
    }

    @ObfuscatedName("mb.bx(Lmf;I)V")
    public void method5608(class324 arg0) {
        this.field3617 = arg0;
    }

    @ObfuscatedName("mb.bn(Lmf;I)V")
    public void method5609(class324 arg0) {
        this.field3612 = arg0;
    }

    @ObfuscatedName("mb.bw(I)Lpj;")
    public class395 method5686() {
        return this.field3600;
    }

    @ObfuscatedName("mb.bc(I)Lpj;")
    public class395 method5611() {
        return this.field3589;
    }

    @ObfuscatedName("mb.bg(I)Lpl;")
    public class399 method5576() {
        return this.field3600.method6704(this.field3607, this.field3608);
    }

    @ObfuscatedName("mb.cw(I)Z")
    public boolean method5613() {
        return this.field3613;
    }

    @ObfuscatedName("mb.cf(I)Z")
    public boolean method5614() {
        return this.field3601;
    }

    @ObfuscatedName("mb.cm(B)Z")
    public boolean method5666() {
        return this.method5613() && this.field3598 % 60 < 30;
    }

    @ObfuscatedName("mb.cn(B)I")
    public int method5616() {
        return this.field3608;
    }

    @ObfuscatedName("mb.cs(B)I")
    public int method5617() {
        return this.field3607;
    }

    @ObfuscatedName("mb.cx(B)Z")
    public boolean method5618() {
        return this.field3603;
    }

    @ObfuscatedName("mb.cr(I)I")
    public int method5619() {
        return this.field3615;
    }

    @ObfuscatedName("mb.cd(I)I")
    public int method5742() {
        return this.field3602;
    }

    @ObfuscatedName("mb.ce(I)I")
    public int method5782() {
        return this.field3600.method6817();
    }

    @ObfuscatedName("mb.cq(I)I")
    public int method5754() {
        return this.field3600.method6720();
    }

    @ObfuscatedName("mb.cp(B)I")
    public int method5818() {
        return this.field3616;
    }

    @ObfuscatedName("mb.cv(S)I")
    public int method5624() {
        return this.field3604;
    }

    @ObfuscatedName("mb.co(I)I")
    public int method5579() {
        return this.field3600.method6739();
    }

    @ObfuscatedName("mb.cl(B)I")
    public int method5717() {
        return this.field3606;
    }

    @ObfuscatedName("mb.cu(I)I")
    public int method5570() {
        return this.field3600.method6722();
    }

    @ObfuscatedName("mb.ch(B)Z")
    public boolean method5699() {
        return this.method5754() > 1;
    }

    @ObfuscatedName("mb.ci(I)Z")
    public boolean method5629() {
        return this.field3608 != this.field3607;
    }

    @ObfuscatedName("mb.ca(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5621(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5628(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("mb.cb(Lss;Lss;B)V")
    public void method5631(class486 arg0, class486 arg1) {
        if ((Integer) arg1.field4967 < (Integer) arg0.field4967) {
            this.method5586((Integer) arg0.field4966, (Integer) arg1.field4967);
        } else {
            this.method5586((Integer) arg0.field4967, (Integer) arg1.field4966);
        }
    }

    @ObfuscatedName("mb.cg(IB)Lss;")
    public class486 method5632(int arg0) {
        int var2 = this.field3600.method6695();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5638(this.field3600.method6717(var5 - 1).field4477)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5638(this.field3600.method6717(var6).field4477)) {
                var4 = var6;
                break;
            }
        }
        return new class486(var3, var4);
    }

    @ObfuscatedName("mb.cj(II)Lss;")
    public class486 method5633(int arg0) {
        int var2 = this.field3600.method6695();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3600.method6717(var5 - 1).field4477 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3600.method6717(var6).field4477 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class486(var3, var4);
    }

    @ObfuscatedName("mb.cz(I)Z")
    public boolean method5634() {
        if (!this.method5618()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3600.method6695() > this.field3616) {
            this.field3600.method6711(this.field3616, this.field3600.method6695());
            var1 = true;
        }
        int var2 = this.method5754();
        if (this.field3600.method6755() > var2) {
            int var3 = this.field3600.method6713(0, var2) - 1;
            this.field3600.method6711(var3, this.field3600.method6695());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3608;
            int var5 = this.field3607;
            int var6 = this.field3600.method6695();
            if (this.field3608 > var6) {
                var4 = var6;
            }
            if (this.field3607 > var6) {
                var5 = var6;
            }
            this.method5586(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("mb.ct(IZI)V")
    public void method5635(int arg0, boolean arg1) {
        if (arg1) {
            this.method5586(this.field3607, arg0);
        } else {
            this.method5586(arg0, arg0);
        }
    }

    @ObfuscatedName("mb.cy(B)I")
    public int method5636() {
        return this.field3614 / this.field3600.method6716();
    }

    @ObfuscatedName("mb.ck(I)V")
    public void method5637() {
        class399 var1 = this.field3600.method6704(0, this.field3608);
        class486 var2 = var1.method6959();
        int var3 = this.field3600.method6716();
        int var4 = (Integer) var2.field4967 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field4966 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3615;
        int var9 = this.field3605 + var8;
        int var10 = this.field3602;
        int var11 = this.field3614 + var10;
        int var12 = this.field3615;
        int var13 = this.field3602;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3605;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3614;
        }
        this.method5571(var12, var13);
    }

    @ObfuscatedName("mb.cc(II)Z")
    public boolean method5638(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("mb.dh(I)V")
    public void method5639() {
        if (this.field3617 != null) {
            this.field3617.method2568();
        }
    }

    @ObfuscatedName("mb.dj(II)Z")
    public boolean method5628(int arg0) {
        switch(this.field3606) {
            case 1:
                return class387.method5051((char) arg0);
            case 2:
                return class387.method3498((char) arg0);
            case 3:
                return Statics.method5838((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (Statics.method5838(var2)) {
                    return true;
                } else if (var2 == 'k' || var2 == 'K' || var2 == 'm' || var2 == 'M' || var2 == 'b' || var2 == 'B') {
                    return true;
                } else {
                    return false;
                }
            default:
                return true;
        }
    }

    @ObfuscatedName("mb.di(I)Lss;")
    public class486 method5641() {
        int var1 = this.field3600.method6723(this.field3605);
        int var2 = this.field3600.method6724(this.field3614);
        return new class486(var1, var2);
    }
}
