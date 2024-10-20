package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("nz")
public class class345 {

    @ObfuscatedName("nz.au")
    public class410 field3635 = new class410();

    @ObfuscatedName("nz.ai")
    public class410 field3659 = new class410();

    @ObfuscatedName("nz.ae")
    public boolean field3654 = false;

    @ObfuscatedName("nz.aw")
    public boolean field3641 = true;

    @ObfuscatedName("nz.aq")
    public int field3630 = 0;

    @ObfuscatedName("nz.az")
    public boolean field3643 = false;

    @ObfuscatedName("nz.at")
    public int field3644 = 0;

    @ObfuscatedName("nz.af")
    public int field3649 = 0;

    @ObfuscatedName("nz.ad")
    public int field3640 = 0;

    @ObfuscatedName("nz.bn")
    public int field3647 = 0;

    @ObfuscatedName("nz.bk")
    public int field3648 = 0;

    @ObfuscatedName("nz.by")
    public int field3646 = 0;

    @ObfuscatedName("nz.bd")
    public int field3650 = 0;

    @ObfuscatedName("nz.be")
    public int field3651 = Integer.MAX_VALUE;

    @ObfuscatedName("nz.bv")
    public int field3652 = Integer.MAX_VALUE;

    @ObfuscatedName("nz.ba")
    public int field3653 = 0;

    @ObfuscatedName("nz.bz")
    public int field3638 = 0;

    @ObfuscatedName("nz.bb")
    public int field3642 = 0;

    @ObfuscatedName("nz.bo")
    public int field3656 = 0;

    @ObfuscatedName("nz.bp")
    public class338 field3657;

    @ObfuscatedName("nz.bt")
    public class338 field3658;

    public class345() {
        this.field3635.method6807(1);
        this.field3659.method6807(1);
    }

    @ObfuscatedName("nz.ac(B)V")
    public void method5796() {
        this.field3630 = (this.field3630 + 1) % 60;
        if (this.field3650 > 0) {
            this.field3650--;
        }
    }

    @ObfuscatedName("nz.al(ZI)Z")
    public boolean method5703(boolean arg0) {
        boolean var2 = arg0 && this.field3641;
        boolean var3 = this.field3654 != var2;
        this.field3654 = var2;
        if (!this.field3654) {
            this.method5713(this.field3647, this.field3647);
        }
        return var3;
    }

    @ObfuscatedName("nz.ak(ZI)V")
    public void method5704(boolean arg0) {
        this.field3641 = arg0;
        this.field3654 = arg0 && this.field3654;
    }

    @ObfuscatedName("nz.ax(Ljava/lang/String;I)Z")
    public boolean method5705(String arg0) {
        String var2 = this.field3635.method6802();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5942(arg0);
        this.field3635.method6886(var3);
        this.method5713(this.field3648, this.field3647);
        this.method5712(this.field3642, this.field3656);
        this.method5775();
        this.method5966();
        return true;
    }

    @ObfuscatedName("nz.ao(Ljava/lang/String;I)Z")
    public boolean method5706(String arg0) {
        this.field3659.method6886(arg0);
        return true;
    }

    @ObfuscatedName("nz.ah(Lpk;I)Z")
    public boolean method5707(class413 arg0) {
        boolean var2 = !this.field3643;
        this.field3635.method6806(arg0);
        this.field3659.method6806(arg0);
        this.field3643 = true;
        boolean var3 = var2 | this.method5712(this.field3642, this.field3656);
        boolean var4 = var3 | this.method5713(this.field3648, this.field3647);
        if (this.method5775()) {
            this.method5966();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("nz.ar(IIB)Z")
    public boolean method5900(int arg0, int arg1) {
        boolean var3 = this.field3653 != arg0 || this.field3638 != arg1;
        this.field3653 = arg0;
        this.field3638 = arg1;
        return var3 | this.method5712(this.field3642, this.field3656);
    }

    @ObfuscatedName("nz.ab(IB)Z")
    public boolean method5720(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3635.method6810();
        this.field3635.method6861(arg0);
        this.field3659.method6861(arg0);
        if (this.method5775()) {
            this.method5966();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("nz.am(IB)Z")
    public boolean method5710(int arg0) {
        this.field3635.method6804(arg0);
        if (this.method5775()) {
            this.method5966();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nz.av(II)Z")
    public boolean method5811(int arg0) {
        this.field3652 = arg0;
        if (this.method5775()) {
            this.method5966();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nz.ag(III)Z")
    public boolean method5712(int arg0, int arg1) {
        if (!this.method5759()) {
            this.field3642 = arg0;
            this.field3656 = arg1;
            return false;
        }
        int var3 = this.field3642;
        int var4 = this.field3656;
        int var5 = Math.max(0, this.field3635.method6820() - this.field3653 + 2);
        int var6 = Math.max(0, this.field3635.method6821() - this.field3638 + 1);
        this.field3642 = Math.max(0, Math.min(var5, arg0));
        this.field3656 = Math.max(0, Math.min(var6, arg1));
        return this.field3642 != var3 || this.field3656 != var4;
    }

    @ObfuscatedName("nz.aa(III)Z")
    public boolean method5936(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3635.method6808(arg0, arg1) : false;
    }

    @ObfuscatedName("nz.ap(II)V")
    public void method5714(int arg0) {
        this.field3635.method6809(arg0);
    }

    @ObfuscatedName("nz.ay(II)V")
    public void method5715(int arg0) {
        this.field3644 = arg0;
    }

    @ObfuscatedName("nz.as(IB)V")
    public void method5716(int arg0) {
        this.field3635.method6807(arg0);
    }

    @ObfuscatedName("nz.aj(II)V")
    public void method5717(int arg0) {
        this.field3635.method6805(arg0);
    }

    @ObfuscatedName("nz.an(IS)Z")
    public boolean method5718(int arg0) {
        this.field3640 = arg0;
        String var2 = this.field3635.method6802();
        int var3 = var2.length();
        String var4 = this.method5942(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3635.method6886(var4);
        this.method5712(this.field3642, this.field3656);
        this.method5775();
        this.method5966();
        return true;
    }

    @ObfuscatedName("nz.au(I)V")
    public void method5885() {
        this.field3643 = false;
    }

    @ObfuscatedName("nz.ai(IS)Z")
    public boolean method5732(int arg0) {
        if (this.method5781(arg0)) {
            this.method5725();
            class411 var2 = this.field3635.method6917((char) arg0, this.field3647, this.field3651);
            this.method5713(var2.method6937(), var2.method6937());
            this.method5775();
            this.method5966();
        }
        return true;
    }

    @ObfuscatedName("nz.ae(I)V")
    public void method5721() {
        if (!this.method5725() && this.field3647 > 0) {
            int var1 = this.field3635.method6816(this.field3647 - 1);
            this.method5966();
            this.method5713(var1, var1);
        }
    }

    @ObfuscatedName("nz.aw(B)V")
    public void method5894() {
        if (!this.method5725() && this.field3647 < this.field3635.method6801()) {
            int var1 = this.field3635.method6816(this.field3647);
            this.method5966();
            this.method5713(var1, var1);
        }
    }

    @ObfuscatedName("nz.aq(I)V")
    public void method5878() {
        if (!this.method5725() && this.field3647 > 0) {
            class501 var1 = this.method5773(this.field3647 - 1);
            int var2 = this.field3635.method6817((Integer) var1.field5004, this.field3647);
            this.method5966();
            this.method5713(var2, var2);
        }
    }

    @ObfuscatedName("nz.az(I)V")
    public void method5962() {
        if (!this.method5725() && this.field3647 < this.field3635.method6801()) {
            class501 var1 = this.method5773(this.field3647);
            int var2 = this.field3635.method6817(this.field3647, (Integer) var1.field5005);
            this.method5966();
            this.method5713(var2, var2);
        }
    }

    @ObfuscatedName("nz.at(I)Z")
    public boolean method5725() {
        if (this.method5964()) {
            int var1 = this.field3635.method6817(this.field3648, this.field3647);
            this.method5966();
            this.method5713(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nz.af(B)V")
    public void method5726() {
        this.method5713(0, this.field3635.method6801());
    }

    @ObfuscatedName("nz.ad(III)Z")
    public boolean method5713(int arg0, int arg1) {
        if (!this.method5759()) {
            this.field3648 = arg0;
            this.field3647 = arg1;
            return false;
        }
        if (arg0 > this.field3635.method6801()) {
            arg0 = this.field3635.method6801();
        }
        if (arg1 > this.field3635.method6801()) {
            arg1 = this.field3635.method6801();
        }
        boolean var3 = this.field3648 != arg0 || this.field3647 != arg1;
        this.field3648 = arg0;
        if (this.field3647 != arg1) {
            this.field3647 = arg1;
            this.field3630 = 0;
            this.method5778();
        }
        if (var3 && this.field3658 != null) {
            this.field3658.method2604();
        }
        return var3;
    }

    @ObfuscatedName("nz.bn(ZB)V")
    public void method5880(boolean arg0) {
        class501 var2 = this.method5774(this.field3647);
        this.method5776((Integer) var2.field5004, arg0);
    }

    @ObfuscatedName("nz.bk(ZI)V")
    public void method5729(boolean arg0) {
        class501 var2 = this.method5774(this.field3647);
        this.method5776((Integer) var2.field5005, arg0);
    }

    @ObfuscatedName("nz.by(ZB)V")
    public void method5730(boolean arg0) {
        this.method5776(0, arg0);
    }

    @ObfuscatedName("nz.bd(ZI)V")
    public void method5731(boolean arg0) {
        this.method5776(this.field3635.method6801(), arg0);
    }

    @ObfuscatedName("nz.be(ZI)V")
    public void method5852(boolean arg0) {
        if (this.method5964() && !arg0) {
            this.method5776(Math.min(this.field3648, this.field3647), arg0);
        } else if (this.field3647 > 0) {
            this.method5776(this.field3647 - 1, arg0);
        }
    }

    @ObfuscatedName("nz.bv(ZI)V")
    public void method5733(boolean arg0) {
        if (this.method5964() && !arg0) {
            this.method5776(Math.max(this.field3648, this.field3647), arg0);
        } else if (this.field3647 < this.field3635.method6801()) {
            this.method5776(this.field3647 + 1, arg0);
        }
    }

    @ObfuscatedName("nz.ba(ZI)V")
    public void method5734(boolean arg0) {
        if (this.field3647 > 0) {
            class501 var2 = this.method5773(this.field3647 - 1);
            this.method5776((Integer) var2.field5004, arg0);
        }
    }

    @ObfuscatedName("nz.bz(ZI)V")
    public void method5735(boolean arg0) {
        if (this.field3647 < this.field3635.method6801()) {
            class501 var2 = this.method5773(this.field3647 + 1);
            this.method5776((Integer) var2.field5005, arg0);
        }
    }

    @ObfuscatedName("nz.bb(ZI)V")
    public void method5736(boolean arg0) {
        if (this.field3647 > 0) {
            this.method5776(this.field3635.method6819(this.field3647, -1), arg0);
        }
    }

    @ObfuscatedName("nz.bo(ZI)V")
    public void method5737(boolean arg0) {
        if (this.field3647 < this.field3635.method6801()) {
            this.method5776(this.field3635.method6819(this.field3647, 1), arg0);
        }
    }

    @ObfuscatedName("nz.bp(ZB)V")
    public void method5738(boolean arg0) {
        if (this.field3647 > 0) {
            int var2 = this.method5777();
            this.method5776(this.field3635.method6819(this.field3647, -var2), arg0);
        }
    }

    @ObfuscatedName("nz.bt(ZI)V")
    public void method5739(boolean arg0) {
        if (this.field3647 < this.field3635.method6801()) {
            int var2 = this.method5777();
            this.method5776(this.field3635.method6819(this.field3647, var2), arg0);
        }
    }

    @ObfuscatedName("nz.bm(ZS)V")
    public void method5740(boolean arg0) {
        class414 var2 = this.field3635.method6883(0, this.field3647);
        class501 var3 = var2.method7038();
        this.method5776(this.field3635.method6818((Integer) var3.field5004, this.field3656), arg0);
    }

    @ObfuscatedName("nz.br(ZB)V")
    public void method5741(boolean arg0) {
        class414 var2 = this.field3635.method6883(0, this.field3647);
        class501 var3 = var2.method7038();
        this.method5776(this.field3635.method6818((Integer) var3.field5004, this.field3656 + this.field3638), arg0);
    }

    @ObfuscatedName("nz.bs(IIZZI)V")
    public void method5742(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3643) {
            int var7 = this.field3642 + arg0;
            int var8 = this.field3656 + arg1;
            class501 var9 = this.method5968();
            var6 = this.field3635.method6818(var7 - (Integer) var9.field5004, var8 - (Integer) var9.field5005);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3649 = 1;
            class501 var10 = this.method5773(var6);
            class501 var11 = this.method5773(this.field3646);
            this.method5702(var11, var10);
        } else if (arg2) {
            this.field3649 = 1;
            class501 var12 = this.method5773(var6);
            this.method5713((Integer) var12.field5004, (Integer) var12.field5005);
            this.field3646 = (Integer) var12.field5004;
        } else if (arg3) {
            this.method5713(this.field3646, var6);
        } else {
            if (this.field3650 <= 0 || this.field3646 != var6) {
                this.field3649 = 0;
                this.method5713(var6, var6);
                this.field3646 = var6;
            } else if (this.field3648 == this.field3647) {
                this.field3649 = 1;
                class501 var13 = this.method5773(var6);
                this.method5713((Integer) var13.field5004, (Integer) var13.field5005);
            } else {
                this.field3649 = 2;
                class501 var14 = this.method5774(var6);
                this.method5713((Integer) var14.field5004, (Integer) var14.field5005);
            }
            this.field3650 = 25;
        }
    }

    @ObfuscatedName("nz.bc(III)V")
    public void method5961(int arg0, int arg1) {
        if (!this.field3643 || !this.method5754()) {
            return;
        }
        int var3 = this.field3642 + arg0;
        int var4 = this.field3656 + arg1;
        class501 var5 = this.method5968();
        int var6 = this.field3635.method6818(var3 - (Integer) var5.field5004, var4 - (Integer) var5.field5005);
        switch(this.field3649) {
            case 0:
                this.method5713(this.field3648, var6);
                break;
            case 1:
                class501 var9 = this.method5773(this.field3646);
                class501 var10 = this.method5773(var6);
                this.method5702(var9, var10);
                break;
            case 2:
                class501 var7 = this.method5774(this.field3646);
                class501 var8 = this.method5774(var6);
                this.method5702(var7, var8);
        }
    }

    @ObfuscatedName("nz.bu(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5744(Clipboard arg0) {
        class414 var2 = this.field3635.method6883(this.field3648, this.field3647);
        if (!var2.method7034()) {
            String var3 = var2.method7047();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("nz.bf(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5853(Clipboard arg0) {
        if (this.method5964()) {
            this.method5744(arg0);
            this.method5725();
        }
    }

    @ObfuscatedName("nz.bh(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5907(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5942((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5725();
            class411 var4 = this.field3635.method6812(var3, this.field3647, this.field3651);
            this.method5713(var4.method6937(), var4.method6937());
            this.method5775();
            this.method5966();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("nz.bl(B)V")
    public void method5810() {
        this.field3656 = Math.max(0, this.field3656 - this.field3635.method6822());
    }

    @ObfuscatedName("nz.bg(I)V")
    public void method5719() {
        int var1 = Math.max(0, this.field3635.method6821() - this.field3638);
        this.field3656 = Math.min(var1, this.field3656 + this.field3635.method6822());
    }

    @ObfuscatedName("nz.bj(Lmg;I)V")
    public void method5749(class338 arg0) {
        this.field3657 = arg0;
    }

    @ObfuscatedName("nz.bx(Lmg;I)V")
    public void method5748(class338 arg0) {
        this.field3658 = arg0;
    }

    @ObfuscatedName("nz.bi(B)Lpp;")
    public class410 method5931() {
        return this.field3635;
    }

    @ObfuscatedName("nz.bq(I)Lpp;")
    public class410 method5752() {
        return this.field3659;
    }

    @ObfuscatedName("nz.bw(I)Lpr;")
    public class414 method5753() {
        return this.field3635.method6883(this.field3648, this.field3647);
    }

    @ObfuscatedName("nz.ce(I)Z")
    public boolean method5754() {
        return this.field3654;
    }

    @ObfuscatedName("nz.cu(I)Z")
    public boolean method5755() {
        return this.field3641;
    }

    @ObfuscatedName("nz.cw(B)Z")
    public boolean method5756() {
        return this.method5754() && this.field3630 % 60 < 30;
    }

    @ObfuscatedName("nz.co(I)I")
    public int method5757() {
        return this.field3647;
    }

    @ObfuscatedName("nz.cc(B)I")
    public int method5758() {
        return this.field3648;
    }

    @ObfuscatedName("nz.cg(I)Z")
    public boolean method5759() {
        return this.field3643;
    }

    @ObfuscatedName("nz.cq(I)I")
    public int method5760() {
        return this.field3642;
    }

    @ObfuscatedName("nz.cy(B)I")
    public int method5761() {
        return this.field3656;
    }

    @ObfuscatedName("nz.cz(I)I")
    public int method5922() {
        return this.field3635.method6810();
    }

    @ObfuscatedName("nz.cp(B)I")
    public int method5763() {
        return this.field3635.method6838();
    }

    @ObfuscatedName("nz.cb(I)I")
    public int method5764() {
        return this.field3652;
    }

    @ObfuscatedName("nz.cn(I)I")
    public int method5701() {
        return this.field3644;
    }

    @ObfuscatedName("nz.ck(I)I")
    public int method5766() {
        return this.field3635.method6827();
    }

    @ObfuscatedName("nz.cr(S)I")
    public int method5767() {
        return this.field3640;
    }

    @ObfuscatedName("nz.cs(S)I")
    public int method5771() {
        return this.field3635.method6828();
    }

    @ObfuscatedName("nz.cm(I)Z")
    public boolean method5769() {
        return this.method5763() > 1;
    }

    @ObfuscatedName("nz.cv(I)Z")
    public boolean method5964() {
        return this.field3648 != this.field3647;
    }

    @ObfuscatedName("nz.ci(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5942(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5781(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("nz.cj(Ltw;Ltw;I)V")
    public void method5702(class501 arg0, class501 arg1) {
        if ((Integer) arg1.field5004 < (Integer) arg0.field5004) {
            this.method5713((Integer) arg0.field5005, (Integer) arg1.field5004);
        } else {
            this.method5713((Integer) arg0.field5004, (Integer) arg1.field5005);
        }
    }

    @ObfuscatedName("nz.cx(II)Ltw;")
    public class501 method5773(int arg0) {
        int var2 = this.field3635.method6801();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5779(this.field3635.method6797(var5 - 1).field4524)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5779(this.field3635.method6797(var6).field4524)) {
                var4 = var6;
                break;
            }
        }
        return new class501(var3, var4);
    }

    @ObfuscatedName("nz.ch(II)Ltw;")
    public class501 method5774(int arg0) {
        int var2 = this.field3635.method6801();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3635.method6797(var5 - 1).field4524 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3635.method6797(var6).field4524 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class501(var3, var4);
    }

    @ObfuscatedName("nz.cd(I)Z")
    public boolean method5775() {
        if (!this.method5759()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3635.method6801() > this.field3652) {
            this.field3635.method6817(this.field3652, this.field3635.method6801());
            var1 = true;
        }
        int var2 = this.method5763();
        if (this.field3635.method6823() > var2) {
            int var3 = this.field3635.method6819(0, var2) - 1;
            this.field3635.method6817(var3, this.field3635.method6801());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3647;
            int var5 = this.field3648;
            int var6 = this.field3635.method6801();
            if (this.field3647 > var6) {
                var4 = var6;
            }
            if (this.field3648 > var6) {
                var5 = var6;
            }
            this.method5713(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("nz.ct(IZI)V")
    public void method5776(int arg0, boolean arg1) {
        if (arg1) {
            this.method5713(this.field3648, arg0);
        } else {
            this.method5713(arg0, arg0);
        }
    }

    @ObfuscatedName("nz.cf(I)I")
    public int method5777() {
        return this.field3638 / this.field3635.method6822();
    }

    @ObfuscatedName("nz.cl(I)V")
    public void method5778() {
        class414 var1 = this.field3635.method6883(0, this.field3647);
        class501 var2 = var1.method7038();
        int var3 = this.field3635.method6822();
        int var4 = (Integer) var2.field5004 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5005 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3642;
        int var9 = this.field3653 + var8;
        int var10 = this.field3656;
        int var11 = this.field3638 + var10;
        int var12 = this.field3642;
        int var13 = this.field3656;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3653;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3638;
        }
        this.method5712(var12, var13);
    }

    @ObfuscatedName("nz.ca(IB)Z")
    public boolean method5779(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("nz.dv(I)V")
    public void method5966() {
        if (this.field3657 != null) {
            this.field3657.method2604();
        }
    }

    @ObfuscatedName("nz.dm(IB)Z")
    public boolean method5781(int arg0) {
        switch(this.field3640) {
            case 1:
                return class402.method1067((char) arg0);
            case 2:
                return class402.method2918((char) arg0);
            case 3:
                return class402.method8966((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class402.method8966(var2)) {
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

    @ObfuscatedName("nz.ds(I)Ltw;")
    public class501 method5968() {
        int var1 = this.field3635.method6829(this.field3653);
        int var2 = this.field3635.method6929(this.field3638);
        return new class501(var1, var2);
    }
}
