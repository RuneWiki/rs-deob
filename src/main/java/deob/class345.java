package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("nl")
public class class345 {

    @ObfuscatedName("nl.ak")
    public class411 field3662 = new class411();

    @ObfuscatedName("nl.ay")
    public class411 field3663 = new class411();

    @ObfuscatedName("nl.as")
    public boolean field3664 = false;

    @ObfuscatedName("nl.ab")
    public boolean field3665 = true;

    @ObfuscatedName("nl.ah")
    public int field3655 = 0;

    @ObfuscatedName("nl.ai")
    public boolean field3678 = false;

    @ObfuscatedName("nl.ac")
    public int field3659 = 0;

    @ObfuscatedName("nl.al")
    public int field3669 = 0;

    @ObfuscatedName("nl.at")
    public int field3670 = 0;

    @ObfuscatedName("nl.bj")
    public int field3671 = 0;

    @ObfuscatedName("nl.bd")
    public int field3672 = 0;

    @ObfuscatedName("nl.bg")
    public int field3673 = 0;

    @ObfuscatedName("nl.bt")
    public int field3674 = 0;

    @ObfuscatedName("nl.br")
    public int field3675 = Integer.MAX_VALUE;

    @ObfuscatedName("nl.ba")
    public int field3676 = Integer.MAX_VALUE;

    @ObfuscatedName("nl.bk")
    public int field3667 = 0;

    @ObfuscatedName("nl.bn")
    public int field3679 = 0;

    @ObfuscatedName("nl.by")
    public int field3666 = 0;

    @ObfuscatedName("nl.bc")
    public int field3668 = 0;

    @ObfuscatedName("nl.bx")
    public class338 field3681;

    @ObfuscatedName("nl.bf")
    public class338 field3682;

    public class345() {
        this.field3662.method7021(1);
        this.field3663.method7021(1);
    }

    @ObfuscatedName("nl.am(I)V")
    public void method5810() {
        this.field3655 = (this.field3655 + 1) % 60;
        if (this.field3674 > 0) {
            this.field3674--;
        }
    }

    @ObfuscatedName("nl.ap(ZI)Z")
    public boolean method5869(boolean arg0) {
        boolean var2 = arg0 && this.field3665;
        boolean var3 = this.field3664 != var2;
        this.field3664 = var2;
        if (!this.field3664) {
            this.method5835(this.field3671, this.field3671);
        }
        return var3;
    }

    @ObfuscatedName("nl.af(ZB)V")
    public void method5812(boolean arg0) {
        this.field3665 = arg0;
        this.field3664 = arg0 && this.field3664;
    }

    @ObfuscatedName("nl.aj(Ljava/lang/String;B)Z")
    public boolean method6033(String arg0) {
        String var2 = this.field3662.method6955();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5878(arg0);
        this.field3662.method6982(var3);
        this.method5835(this.field3672, this.field3671);
        this.method5820(this.field3666, this.field3668);
        this.method5833();
        this.method5887();
        return true;
    }

    @ObfuscatedName("nl.aq(Ljava/lang/String;B)Z")
    public boolean method5814(String arg0) {
        this.field3663.method6982(arg0);
        return true;
    }

    @ObfuscatedName("nl.ar(Lpw;I)Z")
    public boolean method6031(class414 arg0) {
        boolean var2 = !this.field3678;
        this.field3662.method6957(arg0);
        this.field3663.method6957(arg0);
        this.field3678 = true;
        boolean var3 = var2 | this.method5820(this.field3666, this.field3668);
        boolean var4 = var3 | this.method5835(this.field3672, this.field3671);
        if (this.method5833()) {
            this.method5887();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("nl.ag(III)Z")
    public boolean method5816(int arg0, int arg1) {
        boolean var3 = this.field3667 != arg0 || this.field3679 != arg1;
        this.field3667 = arg0;
        this.field3679 = arg1;
        return var3 | this.method5820(this.field3666, this.field3668);
    }

    @ObfuscatedName("nl.ao(II)Z")
    public boolean method5817(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3662.method6978();
        this.field3662.method6956(arg0);
        this.field3663.method6956(arg0);
        if (this.method5833()) {
            this.method5887();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("nl.ae(II)Z")
    public boolean method5818(int arg0) {
        this.field3662.method6953(arg0);
        if (this.method5833()) {
            this.method5887();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nl.aa(II)Z")
    public boolean method5819(int arg0) {
        this.field3676 = arg0;
        if (this.method5833()) {
            this.method5887();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nl.au(III)Z")
    public boolean method5820(int arg0, int arg1) {
        if (!this.method5866()) {
            this.field3666 = arg0;
            this.field3668 = arg1;
            return false;
        }
        int var3 = this.field3666;
        int var4 = this.field3668;
        int var5 = Math.max(0, this.field3662.method6973() - this.field3667 + 2);
        int var6 = Math.max(0, this.field3662.method7072() - this.field3679 + 1);
        this.field3666 = Math.max(0, Math.min(var5, arg0));
        this.field3668 = Math.max(0, Math.min(var6, arg1));
        return this.field3666 != var3 || this.field3668 != var4;
    }

    @ObfuscatedName("nl.an(III)Z")
    public boolean method5829(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3662.method6981(arg0, arg1) : false;
    }

    @ObfuscatedName("nl.ad(II)V")
    public void method5822(int arg0) {
        this.field3662.method7082(arg0);
    }

    @ObfuscatedName("nl.ax(IB)V")
    public void method5823(int arg0) {
        this.field3659 = arg0;
    }

    @ObfuscatedName("nl.aw(IB)V")
    public void method5840(int arg0) {
        this.field3662.method7021(arg0);
    }

    @ObfuscatedName("nl.az(II)V")
    public void method5825(int arg0) {
        this.field3662.method6958(arg0);
    }

    @ObfuscatedName("nl.av(IB)Z")
    public boolean method5826(int arg0) {
        this.field3670 = arg0;
        String var2 = this.field3662.method6955();
        int var3 = var2.length();
        String var4 = this.method5878(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3662.method6982(var4);
        this.method5820(this.field3666, this.field3668);
        this.method5833();
        this.method5887();
        return true;
    }

    @ObfuscatedName("nl.ak(I)V")
    public void method5827() {
        this.field3678 = false;
    }

    @ObfuscatedName("nl.ay(IS)Z")
    public boolean method5828(int arg0) {
        if (this.method5888(arg0)) {
            this.method6025();
            class412 var2 = this.field3662.method6967((char) arg0, this.field3671, this.field3675);
            this.method5835(var2.method7090(), var2.method7090());
            this.method5833();
            this.method5887();
        }
        return true;
    }

    @ObfuscatedName("nl.as(I)V")
    public void method5939() {
        if (!this.method6025() && this.field3671 > 0) {
            int var1 = this.field3662.method6969(this.field3671 - 1);
            this.method5887();
            this.method5835(var1, var1);
        }
    }

    @ObfuscatedName("nl.ab(B)V")
    public void method6056() {
        if (!this.method6025() && this.field3671 < this.field3662.method7048()) {
            int var1 = this.field3662.method6969(this.field3671);
            this.method5887();
            this.method5835(var1, var1);
        }
    }

    @ObfuscatedName("nl.ah(I)V")
    public void method6012() {
        if (!this.method6025() && this.field3671 > 0) {
            class502 var1 = this.method5933(this.field3671 - 1);
            int var2 = this.field3662.method6993((Integer) var1.field5042, this.field3671);
            this.method5887();
            this.method5835(var2, var2);
        }
    }

    @ObfuscatedName("nl.ai(B)V")
    public void method5832() {
        if (!this.method6025() && this.field3671 < this.field3662.method7048()) {
            class502 var1 = this.method5933(this.field3671);
            int var2 = this.field3662.method6993(this.field3671, (Integer) var1.field5043);
            this.method5887();
            this.method5835(var2, var2);
        }
    }

    @ObfuscatedName("nl.ac(I)Z")
    public boolean method6025() {
        if (this.method5877()) {
            int var1 = this.field3662.method6993(this.field3672, this.field3671);
            this.method5887();
            this.method5835(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nl.al(I)V")
    public void method5834() {
        this.method5835(0, this.field3662.method7048());
    }

    @ObfuscatedName("nl.at(III)Z")
    public boolean method5835(int arg0, int arg1) {
        if (!this.method5866()) {
            this.field3672 = arg0;
            this.field3671 = arg1;
            return false;
        }
        if (arg0 > this.field3662.method7048()) {
            arg0 = this.field3662.method7048();
        }
        if (arg1 > this.field3662.method7048()) {
            arg1 = this.field3662.method7048();
        }
        boolean var3 = this.field3672 != arg0 || this.field3671 != arg1;
        this.field3672 = arg0;
        if (this.field3671 != arg1) {
            this.field3671 = arg1;
            this.field3655 = 0;
            this.method5885();
        }
        if (var3 && this.field3682 != null) {
            this.field3682.method2653();
        }
        return var3;
    }

    @ObfuscatedName("nl.bj(ZB)V")
    public void method6076(boolean arg0) {
        class502 var2 = this.method5881(this.field3671);
        this.method5883((Integer) var2.field5042, arg0);
    }

    @ObfuscatedName("nl.bd(ZI)V")
    public void method5837(boolean arg0) {
        class502 var2 = this.method5881(this.field3671);
        this.method5883((Integer) var2.field5043, arg0);
    }

    @ObfuscatedName("nl.bg(ZB)V")
    public void method5838(boolean arg0) {
        this.method5883(0, arg0);
    }

    @ObfuscatedName("nl.bt(ZI)V")
    public void method5917(boolean arg0) {
        this.method5883(this.field3662.method7048(), arg0);
    }

    @ObfuscatedName("nl.br(ZI)V")
    public void method6047(boolean arg0) {
        if (this.method5877() && !arg0) {
            this.method5883(Math.min(this.field3672, this.field3671), arg0);
        } else if (this.field3671 > 0) {
            this.method5883(this.field3671 - 1, arg0);
        }
    }

    @ObfuscatedName("nl.ba(ZI)V")
    public void method5841(boolean arg0) {
        if (this.method5877() && !arg0) {
            this.method5883(Math.max(this.field3672, this.field3671), arg0);
        } else if (this.field3671 < this.field3662.method7048()) {
            this.method5883(this.field3671 + 1, arg0);
        }
    }

    @ObfuscatedName("nl.bk(ZB)V")
    public void method6009(boolean arg0) {
        if (this.field3671 > 0) {
            class502 var2 = this.method5933(this.field3671 - 1);
            this.method5883((Integer) var2.field5042, arg0);
        }
    }

    @ObfuscatedName("nl.bn(ZB)V")
    public void method5969(boolean arg0) {
        if (this.field3671 < this.field3662.method7048()) {
            class502 var2 = this.method5933(this.field3671 + 1);
            this.method5883((Integer) var2.field5043, arg0);
        }
    }

    @ObfuscatedName("nl.by(ZI)V")
    public void method5844(boolean arg0) {
        if (this.field3671 > 0) {
            this.method5883(this.field3662.method7081(this.field3671, -1), arg0);
        }
    }

    @ObfuscatedName("nl.bc(ZB)V")
    public void method5845(boolean arg0) {
        if (this.field3671 < this.field3662.method7048()) {
            this.method5883(this.field3662.method7081(this.field3671, 1), arg0);
        }
    }

    @ObfuscatedName("nl.bx(ZI)V")
    public void method5920(boolean arg0) {
        if (this.field3671 > 0) {
            int var2 = this.method5957();
            this.method5883(this.field3662.method7081(this.field3671, -var2), arg0);
        }
    }

    @ObfuscatedName("nl.bf(ZI)V")
    public void method5993(boolean arg0) {
        if (this.field3671 < this.field3662.method7048()) {
            int var2 = this.method5957();
            this.method5883(this.field3662.method7081(this.field3671, var2), arg0);
        }
    }

    @ObfuscatedName("nl.bp(ZI)V")
    public void method5848(boolean arg0) {
        class415 var2 = this.field3662.method6963(0, this.field3671);
        class502 var3 = var2.method7225();
        this.method5883(this.field3662.method6971((Integer) var3.field5042, this.field3668), arg0);
    }

    @ObfuscatedName("nl.bv(ZI)V")
    public void method5849(boolean arg0) {
        class415 var2 = this.field3662.method6963(0, this.field3671);
        class502 var3 = var2.method7225();
        this.method5883(this.field3662.method6971((Integer) var3.field5042, this.field3679 + this.field3668), arg0);
    }

    @ObfuscatedName("nl.bm(IIZZB)V")
    public void method5859(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3678) {
            int var7 = this.field3666 + arg0;
            int var8 = this.field3668 + arg1;
            class502 var9 = this.method5889();
            var6 = this.field3662.method6971(var7 - (Integer) var9.field5042, var8 - (Integer) var9.field5043);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3669 = 1;
            class502 var10 = this.method5933(var6);
            class502 var11 = this.method5933(this.field3673);
            this.method5879(var11, var10);
        } else if (arg2) {
            this.field3669 = 1;
            class502 var12 = this.method5933(var6);
            this.method5835((Integer) var12.field5042, (Integer) var12.field5043);
            this.field3673 = (Integer) var12.field5042;
        } else if (arg3) {
            this.method5835(this.field3673, var6);
        } else {
            if (this.field3674 <= 0 || this.field3673 != var6) {
                this.field3669 = 0;
                this.method5835(var6, var6);
                this.field3673 = var6;
            } else if (this.field3672 == this.field3671) {
                this.field3669 = 1;
                class502 var13 = this.method5933(var6);
                this.method5835((Integer) var13.field5042, (Integer) var13.field5043);
            } else {
                this.field3669 = 2;
                class502 var14 = this.method5881(var6);
                this.method5835((Integer) var14.field5042, (Integer) var14.field5043);
            }
            this.field3674 = 25;
        }
    }

    @ObfuscatedName("nl.bq(III)V")
    public void method5912(int arg0, int arg1) {
        if (!this.field3678 || !this.method5862()) {
            return;
        }
        int var3 = this.field3666 + arg0;
        int var4 = this.field3668 + arg1;
        class502 var5 = this.method5889();
        int var6 = this.field3662.method6971(var3 - (Integer) var5.field5042, var4 - (Integer) var5.field5043);
        switch(this.field3669) {
            case 0:
                this.method5835(this.field3672, var6);
                break;
            case 1:
                class502 var9 = this.method5933(this.field3673);
                class502 var10 = this.method5933(var6);
                this.method5879(var9, var10);
                break;
            case 2:
                class502 var7 = this.method5881(this.field3673);
                class502 var8 = this.method5881(var6);
                this.method5879(var7, var8);
        }
    }

    @ObfuscatedName("nl.bb(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5852(Clipboard arg0) {
        class415 var2 = this.field3662.method6963(this.field3672, this.field3671);
        if (!var2.method7221()) {
            String var3 = var2.method7222();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("nl.bh(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method5853(Clipboard arg0) {
        if (this.method5877()) {
            this.method5852(arg0);
            this.method6025();
        }
    }

    @ObfuscatedName("nl.bw(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5854(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5878((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method6025();
            class412 var4 = this.field3662.method6965(var3, this.field3671, this.field3675);
            this.method5835(var4.method7090(), var4.method7090());
            this.method5833();
            this.method5887();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("nl.bi(I)V")
    public void method5952() {
        this.field3668 = Math.max(0, this.field3668 - this.field3662.method6975());
    }

    @ObfuscatedName("nl.bu(I)V")
    public void method5938() {
        int var1 = Math.max(0, this.field3662.method7072() - this.field3679);
        this.field3668 = Math.min(var1, this.field3668 + this.field3662.method6975());
    }

    @ObfuscatedName("nl.be(Lmn;I)V")
    public void method5857(class338 arg0) {
        this.field3681 = arg0;
    }

    @ObfuscatedName("nl.bs(Lmn;I)V")
    public void method5858(class338 arg0) {
        this.field3682 = arg0;
    }

    @ObfuscatedName("nl.bl(I)Lpx;")
    public class411 method5836() {
        return this.field3662;
    }

    @ObfuscatedName("nl.bz(I)Lpx;")
    public class411 method5958() {
        return this.field3663;
    }

    @ObfuscatedName("nl.bo(B)Lpo;")
    public class415 method5861() {
        return this.field3662.method6963(this.field3672, this.field3671);
    }

    @ObfuscatedName("nl.cg(B)Z")
    public boolean method5862() {
        return this.field3664;
    }

    @ObfuscatedName("nl.cb(B)Z")
    public boolean method6066() {
        return this.field3665;
    }

    @ObfuscatedName("nl.ci(B)Z")
    public boolean method5942() {
        return this.method5862() && this.field3655 % 60 < 30;
    }

    @ObfuscatedName("nl.cv(I)I")
    public int method5865() {
        return this.field3671;
    }

    @ObfuscatedName("nl.ct(B)I")
    public int method5925() {
        return this.field3672;
    }

    @ObfuscatedName("nl.cp(I)Z")
    public boolean method5866() {
        return this.field3678;
    }

    @ObfuscatedName("nl.cq(B)I")
    public int method5898() {
        return this.field3666;
    }

    @ObfuscatedName("nl.cl(I)I")
    public int method5868() {
        return this.field3668;
    }

    @ObfuscatedName("nl.cs(B)I")
    public int method5846() {
        return this.field3662.method6978();
    }

    @ObfuscatedName("nl.cc(I)I")
    public int method5870() {
        return this.field3662.method6979();
    }

    @ObfuscatedName("nl.cd(I)I")
    public int method5871() {
        return this.field3676;
    }

    @ObfuscatedName("nl.cu(B)I")
    public int method6057() {
        return this.field3659;
    }

    @ObfuscatedName("nl.co(B)I")
    public int method5873() {
        return this.field3662.method6980();
    }

    @ObfuscatedName("nl.cy(B)I")
    public int method5874() {
        return this.field3670;
    }

    @ObfuscatedName("nl.cn(B)I")
    public int method5987() {
        return this.field3662.method7046();
    }

    @ObfuscatedName("nl.ch(I)Z")
    public boolean method5876() {
        return this.method5870() > 1;
    }

    @ObfuscatedName("nl.cr(I)Z")
    public boolean method5877() {
        return this.field3672 != this.field3671;
    }

    @ObfuscatedName("nl.ce(Ljava/lang/String;B)Ljava/lang/String;")
    public String method5878(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5888(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("nl.cz(Ltg;Ltg;I)V")
    public void method5879(class502 arg0, class502 arg1) {
        if ((Integer) arg1.field5042 < (Integer) arg0.field5042) {
            this.method5835((Integer) arg0.field5043, (Integer) arg1.field5042);
        } else {
            this.method5835((Integer) arg0.field5042, (Integer) arg1.field5043);
        }
    }

    @ObfuscatedName("nl.ck(II)Ltg;")
    public class502 method5933(int arg0) {
        int var2 = this.field3662.method7048();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5886(this.field3662.method6950(var5 - 1).field4546)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5886(this.field3662.method6950(var6).field4546)) {
                var4 = var6;
                break;
            }
        }
        return new class502(var3, var4);
    }

    @ObfuscatedName("nl.cm(IB)Ltg;")
    public class502 method5881(int arg0) {
        int var2 = this.field3662.method7048();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3662.method6950(var5 - 1).field4546 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3662.method6950(var6).field4546 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class502(var3, var4);
    }

    @ObfuscatedName("nl.cj(I)Z")
    public boolean method5833() {
        if (!this.method5866()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3662.method7048() > this.field3676) {
            this.field3662.method6993(this.field3676, this.field3662.method7048());
            var1 = true;
        }
        int var2 = this.method5870();
        if (this.field3662.method6976() > var2) {
            int var3 = this.field3662.method7081(0, var2) - 1;
            this.field3662.method6993(var3, this.field3662.method7048());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3671;
            int var5 = this.field3672;
            int var6 = this.field3662.method7048();
            if (this.field3671 > var6) {
                var4 = var6;
            }
            if (this.field3672 > var6) {
                var5 = var6;
            }
            this.method5835(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("nl.cf(IZB)V")
    public void method5883(int arg0, boolean arg1) {
        if (arg1) {
            this.method5835(this.field3672, arg0);
        } else {
            this.method5835(arg0, arg0);
        }
    }

    @ObfuscatedName("nl.cw(I)I")
    public int method5957() {
        return this.field3679 / this.field3662.method6975();
    }

    @ObfuscatedName("nl.cx(I)V")
    public void method5885() {
        class415 var1 = this.field3662.method6963(0, this.field3671);
        class502 var2 = var1.method7225();
        int var3 = this.field3662.method6975();
        int var4 = (Integer) var2.field5042 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5043 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3666;
        int var9 = this.field3667 + var8;
        int var10 = this.field3668;
        int var11 = this.field3679 + var10;
        int var12 = this.field3666;
        int var13 = this.field3668;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3667;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3679;
        }
        this.method5820(var12, var13);
    }

    @ObfuscatedName("nl.ca(IB)Z")
    public boolean method5886(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("nl.dd(B)V")
    public void method5887() {
        if (this.field3681 != null) {
            this.field3681.method2653();
        }
    }

    @ObfuscatedName("nl.dc(II)Z")
    public boolean method5888(int arg0) {
        switch(this.field3670) {
            case 1:
                return class403.method4533((char) arg0);
            case 2:
                return class403.method6336((char) arg0);
            case 3:
                return class403.method1144((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class403.method1144(var2)) {
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

    @ObfuscatedName("nl.dg(I)Ltg;")
    public class502 method5889() {
        int var1 = this.field3662.method6970(this.field3667);
        int var2 = this.field3662.method6983(this.field3679);
        return new class502(var1, var2);
    }
}
