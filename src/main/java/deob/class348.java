package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("nf")
public class class348 {

    @ObfuscatedName("nf.am")
    public class414 field3684 = new class414();

    @ObfuscatedName("nf.ad")
    public class414 field3685 = new class414();

    @ObfuscatedName("nf.at")
    public boolean field3688 = false;

    @ObfuscatedName("nf.ay")
    public boolean field3687 = true;

    @ObfuscatedName("nf.ae")
    public int field3693 = 0;

    @ObfuscatedName("nf.ac")
    public boolean field3689 = false;

    @ObfuscatedName("nf.ab")
    public int field3690 = 0;

    @ObfuscatedName("nf.av")
    public int field3691 = 0;

    @ObfuscatedName("nf.ap")
    public int field3692 = 0;

    @ObfuscatedName("nf.bu")
    public int field3694 = 0;

    @ObfuscatedName("nf.bo")
    public int field3680 = 0;

    @ObfuscatedName("nf.bd")
    public int field3700 = 0;

    @ObfuscatedName("nf.bi")
    public int field3677 = 0;

    @ObfuscatedName("nf.bq")
    public int field3697 = Integer.MAX_VALUE;

    @ObfuscatedName("nf.ba")
    public int field3698 = Integer.MAX_VALUE;

    @ObfuscatedName("nf.bt")
    public int field3699 = 0;

    @ObfuscatedName("nf.bk")
    public int field3696 = 0;

    @ObfuscatedName("nf.bm")
    public int field3695 = 0;

    @ObfuscatedName("nf.bw")
    public int field3702 = 0;

    @ObfuscatedName("nf.bv")
    public class340 field3703;

    @ObfuscatedName("nf.by")
    public class340 field3704;

    public class348() {
        this.field3684.method7069(1);
        this.field3685.method7069(1);
    }

    @ObfuscatedName("nf.aq(I)V")
    public void method6027() {
        this.field3693 = (this.field3693 + 1) % 60;
        if (this.field3677 > 0) {
            this.field3677--;
        }
    }

    @ObfuscatedName("nf.aw(ZI)Z")
    public boolean method6068(boolean arg0) {
        boolean var2 = arg0 && this.field3687;
        boolean var3 = this.field3688 != var2;
        this.field3688 = var2;
        if (!this.field3688) {
            this.method5876(this.field3694, this.field3694);
        }
        return var3;
    }

    @ObfuscatedName("nf.al(ZI)V")
    public void method5854(boolean arg0) {
        this.field3687 = arg0;
        this.field3688 = arg0 && this.field3688;
    }

    @ObfuscatedName("nf.ai(Ljava/lang/String;I)Z")
    public boolean method5897(String arg0) {
        String var2 = this.field3684.method7044();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5873(arg0);
        this.field3684.method7082(var3);
        this.method5876(this.field3680, this.field3694);
        this.method5862(this.field3695, this.field3702);
        this.method5924();
        this.method5929();
        return true;
    }

    @ObfuscatedName("nf.ar(Ljava/lang/String;I)Z")
    public boolean method5856(String arg0) {
        this.field3685.method7082(arg0);
        return true;
    }

    @ObfuscatedName("nf.as(Lqi;B)Z")
    public boolean method5857(class417 arg0) {
        boolean var2 = !this.field3689;
        this.field3684.method7090(arg0);
        this.field3685.method7090(arg0);
        this.field3689 = true;
        boolean var3 = var2 | this.method5862(this.field3695, this.field3702);
        boolean var4 = var3 | this.method5876(this.field3680, this.field3694);
        if (this.method5924()) {
            this.method5929();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("nf.aa(IIB)Z")
    public boolean method5858(int arg0, int arg1) {
        boolean var3 = this.field3699 != arg0 || this.field3696 != arg1;
        this.field3699 = arg0;
        this.field3696 = arg1;
        return var3 | this.method5862(this.field3695, this.field3702);
    }

    @ObfuscatedName("nf.az(II)Z")
    public boolean method5865(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3684.method7057();
        this.field3684.method6990(arg0);
        this.field3685.method6990(arg0);
        if (this.method5924()) {
            this.method5929();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("nf.ao(IB)Z")
    public boolean method5923(int arg0) {
        this.field3684.method6991(arg0);
        if (this.method5924()) {
            this.method5929();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nf.au(II)Z")
    public boolean method6118(int arg0) {
        this.field3698 = arg0;
        if (this.method5924()) {
            this.method5929();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nf.ak(III)Z")
    public boolean method5862(int arg0, int arg1) {
        if (!this.method5908()) {
            this.field3695 = arg0;
            this.field3702 = arg1;
            return false;
        }
        int var3 = this.field3695;
        int var4 = this.field3702;
        int var5 = Math.max(0, this.field3684.method7007() - this.field3699 + 2);
        int var6 = Math.max(0, this.field3684.method7025() - this.field3696 + 1);
        this.field3695 = Math.max(0, Math.min(var5, arg0));
        this.field3702 = Math.max(0, Math.min(var6, arg1));
        return this.field3695 != var3 || this.field3702 != var4;
    }

    @ObfuscatedName("nf.ah(III)Z")
    public boolean method5863(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3684.method6995(arg0, arg1) : false;
    }

    @ObfuscatedName("nf.aj(IB)V")
    public void method5900(int arg0) {
        this.field3684.method6996(arg0);
    }

    @ObfuscatedName("nf.af(II)V")
    public void method5985(int arg0) {
        this.field3690 = arg0;
    }

    @ObfuscatedName("nf.ax(II)V")
    public void method5866(int arg0) {
        this.field3684.method7069(arg0);
    }

    @ObfuscatedName("nf.an(IB)V")
    public void method5867(int arg0) {
        this.field3684.method7021(arg0);
    }

    @ObfuscatedName("nf.ag(IB)Z")
    public boolean method5997(int arg0) {
        this.field3692 = arg0;
        String var2 = this.field3684.method7044();
        int var3 = var2.length();
        String var4 = this.method5873(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3684.method7082(var4);
        this.method5862(this.field3695, this.field3702);
        this.method5924();
        this.method5929();
        return true;
    }

    @ObfuscatedName("nf.am(S)V")
    public void method6088() {
        this.field3689 = false;
    }

    @ObfuscatedName("nf.ad(II)Z")
    public boolean method5870(int arg0) {
        if (this.method5930(arg0)) {
            this.method6080();
            class415 var2 = this.field3684.method6998((char) arg0, this.field3694, this.field3697);
            this.method5876(var2.method7122(), var2.method7122());
            this.method5924();
            this.method5929();
        }
        return true;
    }

    @ObfuscatedName("nf.at(B)V")
    public void method5871() {
        if (!this.method6080() && this.field3694 > 0) {
            int var1 = this.field3684.method7003(this.field3694 - 1);
            this.method5929();
            this.method5876(var1, var1);
        }
    }

    @ObfuscatedName("nf.ay(I)V")
    public void method5872() {
        if (!this.method6080() && this.field3694 < this.field3684.method7001()) {
            int var1 = this.field3684.method7003(this.field3694);
            this.method5929();
            this.method5876(var1, var1);
        }
    }

    @ObfuscatedName("nf.ae(I)V")
    public void method6129() {
        if (!this.method6080() && this.field3694 > 0) {
            class505 var1 = this.method6003(this.field3694 - 1);
            int var2 = this.field3684.method7088((Integer) var1.field5064, this.field3694);
            this.method5929();
            this.method5876(var2, var2);
        }
    }

    @ObfuscatedName("nf.ac(I)V")
    public void method5874() {
        if (!this.method6080() && this.field3694 < this.field3684.method7001()) {
            class505 var1 = this.method6003(this.field3694);
            int var2 = this.field3684.method7088(this.field3694, (Integer) var1.field5065);
            this.method5929();
            this.method5876(var2, var2);
        }
    }

    @ObfuscatedName("nf.ab(I)Z")
    public boolean method6080() {
        if (this.method5946()) {
            int var1 = this.field3684.method7088(this.field3680, this.field3694);
            this.method5929();
            this.method5876(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nf.av(I)V")
    public void method5860() {
        this.method5876(0, this.field3684.method7001());
    }

    @ObfuscatedName("nf.ap(IIB)Z")
    public boolean method5876(int arg0, int arg1) {
        if (!this.method5908()) {
            this.field3680 = arg0;
            this.field3694 = arg1;
            return false;
        }
        if (arg0 > this.field3684.method7001()) {
            arg0 = this.field3684.method7001();
        }
        if (arg1 > this.field3684.method7001()) {
            arg1 = this.field3684.method7001();
        }
        boolean var3 = this.field3680 != arg0 || this.field3694 != arg1;
        this.field3680 = arg0;
        if (this.field3694 != arg1) {
            this.field3694 = arg1;
            this.field3693 = 0;
            this.method6061();
        }
        if (var3 && this.field3704 != null) {
            this.field3704.method2636();
        }
        return var3;
    }

    @ObfuscatedName("nf.bu(ZI)V")
    public void method5877(boolean arg0) {
        class505 var2 = this.method5920(this.field3694);
        this.method5925((Integer) var2.field5064, arg0);
    }

    @ObfuscatedName("nf.bo(ZI)V")
    public void method5878(boolean arg0) {
        class505 var2 = this.method5920(this.field3694);
        this.method5925((Integer) var2.field5065, arg0);
    }

    @ObfuscatedName("nf.bd(ZB)V")
    public void method5879(boolean arg0) {
        this.method5925(0, arg0);
    }

    @ObfuscatedName("nf.bi(ZI)V")
    public void method6112(boolean arg0) {
        this.method5925(this.field3684.method7001(), arg0);
    }

    @ObfuscatedName("nf.bq(ZI)V")
    public void method5881(boolean arg0) {
        if (this.method5946() && !arg0) {
            this.method5925(Math.min(this.field3680, this.field3694), arg0);
        } else if (this.field3694 > 0) {
            this.method5925(this.field3694 - 1, arg0);
        }
    }

    @ObfuscatedName("nf.ba(ZI)V")
    public void method6083(boolean arg0) {
        if (this.method5946() && !arg0) {
            this.method5925(Math.max(this.field3680, this.field3694), arg0);
        } else if (this.field3694 < this.field3684.method7001()) {
            this.method5925(this.field3694 + 1, arg0);
        }
    }

    @ObfuscatedName("nf.bt(ZB)V")
    public void method5883(boolean arg0) {
        if (this.field3694 > 0) {
            class505 var2 = this.method6003(this.field3694 - 1);
            this.method5925((Integer) var2.field5064, arg0);
        }
    }

    @ObfuscatedName("nf.bk(ZI)V")
    public void method5884(boolean arg0) {
        if (this.field3694 < this.field3684.method7001()) {
            class505 var2 = this.method6003(this.field3694 + 1);
            this.method5925((Integer) var2.field5065, arg0);
        }
    }

    @ObfuscatedName("nf.bm(ZB)V")
    public void method5885(boolean arg0) {
        if (this.field3694 > 0) {
            this.method5925(this.field3684.method7006(this.field3694, -1), arg0);
        }
    }

    @ObfuscatedName("nf.bw(ZB)V")
    public void method6056(boolean arg0) {
        if (this.field3694 < this.field3684.method7001()) {
            this.method5925(this.field3684.method7006(this.field3694, 1), arg0);
        }
    }

    @ObfuscatedName("nf.bv(ZB)V")
    public void method5851(boolean arg0) {
        if (this.field3694 > 0) {
            int var2 = this.method5926();
            this.method5925(this.field3684.method7006(this.field3694, -var2), arg0);
        }
    }

    @ObfuscatedName("nf.by(ZB)V")
    public void method5888(boolean arg0) {
        if (this.field3694 < this.field3684.method7001()) {
            int var2 = this.method5926();
            this.method5925(this.field3684.method7006(this.field3694, var2), arg0);
        }
    }

    @ObfuscatedName("nf.bb(ZB)V")
    public void method5889(boolean arg0) {
        class418 var2 = this.field3684.method6997(0, this.field3694);
        class505 var3 = var2.method7245();
        this.method5925(this.field3684.method7005((Integer) var3.field5064, this.field3702), arg0);
    }

    @ObfuscatedName("nf.bn(ZS)V")
    public void method5890(boolean arg0) {
        class418 var2 = this.field3684.method6997(0, this.field3694);
        class505 var3 = var2.method7245();
        this.method5925(this.field3684.method7005((Integer) var3.field5064, this.field3702 + this.field3696), arg0);
    }

    @ObfuscatedName("nf.br(IIZZI)V")
    public void method5891(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3689) {
            int var7 = this.field3695 + arg0;
            int var8 = this.field3702 + arg1;
            class505 var9 = this.method5931();
            var6 = this.field3684.method7005(var7 - (Integer) var9.field5064, var8 - (Integer) var9.field5065);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3691 = 1;
            class505 var10 = this.method6003(var6);
            class505 var11 = this.method6003(this.field3700);
            this.method5921(var11, var10);
        } else if (arg2) {
            this.field3691 = 1;
            class505 var12 = this.method6003(var6);
            this.method5876((Integer) var12.field5064, (Integer) var12.field5065);
            this.field3700 = (Integer) var12.field5064;
        } else if (arg3) {
            this.method5876(this.field3700, var6);
        } else {
            if (this.field3677 <= 0 || this.field3700 != var6) {
                this.field3691 = 0;
                this.method5876(var6, var6);
                this.field3700 = var6;
            } else if (this.field3694 == this.field3680) {
                this.field3691 = 1;
                class505 var13 = this.method6003(var6);
                this.method5876((Integer) var13.field5064, (Integer) var13.field5065);
            } else {
                this.field3691 = 2;
                class505 var14 = this.method5920(var6);
                this.method5876((Integer) var14.field5064, (Integer) var14.field5065);
            }
            this.field3677 = 25;
        }
    }

    @ObfuscatedName("nf.bp(III)V")
    public void method5892(int arg0, int arg1) {
        if (!this.field3689 || !this.method5903()) {
            return;
        }
        int var3 = this.field3695 + arg0;
        int var4 = this.field3702 + arg1;
        class505 var5 = this.method5931();
        int var6 = this.field3684.method7005(var3 - (Integer) var5.field5064, var4 - (Integer) var5.field5065);
        switch(this.field3691) {
            case 0:
                this.method5876(this.field3680, var6);
                break;
            case 1:
                class505 var9 = this.method6003(this.field3700);
                class505 var10 = this.method6003(var6);
                this.method5921(var9, var10);
                break;
            case 2:
                class505 var7 = this.method5920(this.field3700);
                class505 var8 = this.method5920(var6);
                this.method5921(var7, var8);
        }
    }

    @ObfuscatedName("nf.bf(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5893(Clipboard arg0) {
        class418 var2 = this.field3684.method6997(this.field3680, this.field3694);
        if (!var2.method7238()) {
            String var3 = var2.method7242();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("nf.bg(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6093(Clipboard arg0) {
        if (this.method5946()) {
            this.method5893(arg0);
            this.method6080();
        }
    }

    @ObfuscatedName("nf.be(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5945(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5873((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method6080();
            class415 var4 = this.field3684.method6999(var3, this.field3694, this.field3697);
            this.method5876(var4.method7122(), var4.method7122());
            this.method5924();
            this.method5929();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("nf.bc(I)V")
    public void method5896() {
        this.field3702 = Math.max(0, this.field3702 - this.field3684.method7009());
    }

    @ObfuscatedName("nf.bz(I)V")
    public void method5999() {
        int var1 = Math.max(0, this.field3684.method7025() - this.field3696);
        this.field3702 = Math.min(var1, this.field3702 + this.field3684.method7009());
    }

    @ObfuscatedName("nf.bh(Lnw;B)V")
    public void method5898(class340 arg0) {
        this.field3703 = arg0;
    }

    @ObfuscatedName("nf.bs(Lnw;I)V")
    public void method6125(class340 arg0) {
        this.field3704 = arg0;
    }

    @ObfuscatedName("nf.bj(I)Lpv;")
    public class414 method5861() {
        return this.field3684;
    }

    @ObfuscatedName("nf.bl(I)Lpv;")
    public class414 method6057() {
        return this.field3685;
    }

    @ObfuscatedName("nf.bx(B)Lqz;")
    public class418 method5902() {
        return this.field3684.method6997(this.field3680, this.field3694);
    }

    @ObfuscatedName("nf.cs(I)Z")
    public boolean method5903() {
        return this.field3688;
    }

    @ObfuscatedName("nf.ch(S)Z")
    public boolean method5904() {
        return this.field3687;
    }

    @ObfuscatedName("nf.co(B)Z")
    public boolean method5905() {
        return this.method5903() && this.field3693 % 60 < 30;
    }

    @ObfuscatedName("nf.cd(B)I")
    public int method5906() {
        return this.field3694;
    }

    @ObfuscatedName("nf.cg(I)I")
    public int method5907() {
        return this.field3680;
    }

    @ObfuscatedName("nf.cn(I)Z")
    public boolean method5908() {
        return this.field3689;
    }

    @ObfuscatedName("nf.cz(B)I")
    public int method5853() {
        return this.field3695;
    }

    @ObfuscatedName("nf.ci(I)I")
    public int method5910() {
        return this.field3702;
    }

    @ObfuscatedName("nf.cl(I)I")
    public int method5911() {
        return this.field3684.method7057();
    }

    @ObfuscatedName("nf.cm(I)I")
    public int method6009() {
        return this.field3684.method7098();
    }

    @ObfuscatedName("nf.cx(I)I")
    public int method5969() {
        return this.field3698;
    }

    @ObfuscatedName("nf.cw(I)I")
    public int method5914() {
        return this.field3690;
    }

    @ObfuscatedName("nf.cy(B)I")
    public int method5915() {
        return this.field3684.method7014();
    }

    @ObfuscatedName("nf.cu(B)I")
    public int method5916() {
        return this.field3692;
    }

    @ObfuscatedName("nf.ce(I)I")
    public int method5982() {
        return this.field3684.method7055();
    }

    @ObfuscatedName("nf.cv(I)Z")
    public boolean method5918() {
        return this.method6009() > 1;
    }

    @ObfuscatedName("nf.cj(I)Z")
    public boolean method5946() {
        return this.field3694 != this.field3680;
    }

    @ObfuscatedName("nf.ct(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5873(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5930(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("nf.ck(Lth;Lth;S)V")
    public void method5921(class505 arg0, class505 arg1) {
        if ((Integer) arg1.field5064 < (Integer) arg0.field5064) {
            this.method5876((Integer) arg0.field5065, (Integer) arg1.field5064);
        } else {
            this.method5876((Integer) arg0.field5064, (Integer) arg1.field5065);
        }
    }

    @ObfuscatedName("nf.ca(II)Lth;")
    public class505 method6003(int arg0) {
        int var2 = this.field3684.method7001();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5868(this.field3684.method7065(var5 - 1).field4584)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5868(this.field3684.method7065(var6).field4584)) {
                var4 = var6;
                break;
            }
        }
        return new class505(var3, var4);
    }

    @ObfuscatedName("nf.cp(II)Lth;")
    public class505 method5920(int arg0) {
        int var2 = this.field3684.method7001();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3684.method7065(var5 - 1).field4584 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3684.method7065(var6).field4584 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class505(var3, var4);
    }

    @ObfuscatedName("nf.cc(I)Z")
    public boolean method5924() {
        if (!this.method5908()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3684.method7001() > this.field3698) {
            this.field3684.method7088(this.field3698, this.field3684.method7001());
            var1 = true;
        }
        int var2 = this.method6009();
        if (this.field3684.method7010() > var2) {
            int var3 = this.field3684.method7006(0, var2) - 1;
            this.field3684.method7088(var3, this.field3684.method7001());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3694;
            int var5 = this.field3680;
            int var6 = this.field3684.method7001();
            if (this.field3694 > var6) {
                var4 = var6;
            }
            if (this.field3680 > var6) {
                var5 = var6;
            }
            this.method5876(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("nf.cb(IZI)V")
    public void method5925(int arg0, boolean arg1) {
        if (arg1) {
            this.method5876(this.field3680, arg0);
        } else {
            this.method5876(arg0, arg0);
        }
    }

    @ObfuscatedName("nf.cq(I)I")
    public int method5926() {
        return this.field3696 / this.field3684.method7009();
    }

    @ObfuscatedName("nf.cf(I)V")
    public void method6061() {
        class418 var1 = this.field3684.method6997(0, this.field3694);
        class505 var2 = var1.method7245();
        int var3 = this.field3684.method7009();
        int var4 = (Integer) var2.field5064 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5065 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3695;
        int var9 = this.field3699 + var8;
        int var10 = this.field3702;
        int var11 = this.field3696 + var10;
        int var12 = this.field3695;
        int var13 = this.field3702;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3699;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3696;
        }
        this.method5862(var12, var13);
    }

    @ObfuscatedName("nf.cr(II)Z")
    public boolean method5868(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("nf.dg(B)V")
    public void method5929() {
        if (this.field3703 != null) {
            this.field3703.method2636();
        }
    }

    @ObfuscatedName("nf.dc(II)Z")
    public boolean method5930(int arg0) {
        switch(this.field3692) {
            case 1:
                return class406.method5374((char) arg0);
            case 2:
                return class406.method3068((char) arg0);
            case 3:
                return class406.method4207((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class406.method4207(var2)) {
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

    @ObfuscatedName("nf.do(I)Lth;")
    public class505 method5931() {
        int var1 = this.field3684.method7063(this.field3699);
        int var2 = this.field3684.method7076(this.field3696);
        return new class505(var1, var2);
    }
}
