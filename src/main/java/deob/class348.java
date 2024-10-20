package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("nf")
public class class348 {

    @ObfuscatedName("nf.ay")
    public class415 field3705 = new class415();

    @ObfuscatedName("nf.ap")
    public class415 field3706 = new class415();

    @ObfuscatedName("nf.av")
    public boolean field3721 = false;

    @ObfuscatedName("nf.aa")
    public boolean field3708 = true;

    @ObfuscatedName("nf.aq")
    public int field3709 = 0;

    @ObfuscatedName("nf.am")
    public boolean field3710 = false;

    @ObfuscatedName("nf.ac")
    public int field3711 = 0;

    @ObfuscatedName("nf.ae")
    public int field3712 = 0;

    @ObfuscatedName("nf.ak")
    public int field3713 = 0;

    @ObfuscatedName("nf.bp")
    public int field3714 = 0;

    @ObfuscatedName("nf.bz")
    public int field3715 = 0;

    @ObfuscatedName("nf.bc")
    public int field3716 = 0;

    @ObfuscatedName("nf.bf")
    public int field3704 = 0;

    @ObfuscatedName("nf.be")
    public int field3700 = Integer.MAX_VALUE;

    @ObfuscatedName("nf.bn")
    public int field3719 = Integer.MAX_VALUE;

    @ObfuscatedName("nf.bd")
    public int field3720 = 0;

    @ObfuscatedName("nf.bo")
    public int field3718 = 0;

    @ObfuscatedName("nf.bx")
    public int field3707 = 0;

    @ObfuscatedName("nf.bl")
    public int field3723 = 0;

    @ObfuscatedName("nf.bh")
    public class340 field3724;

    @ObfuscatedName("nf.bs")
    public class340 field3725;

    public class348() {
        this.field3705.method6877(1);
        this.field3706.method6877(1);
    }

    @ObfuscatedName("nf.az(S)V")
    public void method5975() {
        this.field3709 = (this.field3709 + 1) % 60;
        if (this.field3704 > 0) {
            this.field3704--;
        }
    }

    @ObfuscatedName("nf.ah(ZB)Z")
    public boolean method5886(boolean arg0) {
        boolean var2 = arg0 && this.field3708;
        boolean var3 = this.field3721 != var2;
        this.field3721 = var2;
        if (!this.field3721) {
            this.method5788(this.field3714, this.field3714);
        }
        return var3;
    }

    @ObfuscatedName("nf.af(ZI)V")
    public void method5765(boolean arg0) {
        this.field3708 = arg0;
        this.field3721 = arg0 && this.field3721;
    }

    @ObfuscatedName("nf.at(Ljava/lang/String;I)Z")
    public boolean method5766(String arg0) {
        String var2 = this.field3705.method6897();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method5965(arg0);
        this.field3705.method6889(var3);
        this.method5788(this.field3715, this.field3714);
        this.method5773(this.field3707, this.field3723);
        this.method6021();
        this.method5841();
        return true;
    }

    @ObfuscatedName("nf.an(Ljava/lang/String;I)Z")
    public boolean method5767(String arg0) {
        this.field3706.method6889(arg0);
        return true;
    }

    @ObfuscatedName("nf.ao(Lqu;I)Z")
    public boolean method5768(class418 arg0) {
        boolean var2 = !this.field3710;
        this.field3705.method6876(arg0);
        this.field3706.method6876(arg0);
        this.field3710 = true;
        boolean var3 = var2 | this.method5773(this.field3707, this.field3723);
        boolean var4 = var3 | this.method5788(this.field3715, this.field3714);
        if (this.method6021()) {
            this.method5841();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("nf.ab(III)Z")
    public boolean method5769(int arg0, int arg1) {
        boolean var3 = this.field3720 != arg0 || this.field3718 != arg1;
        this.field3720 = arg0;
        this.field3718 = arg1;
        return var3 | this.method5773(this.field3707, this.field3723);
    }

    @ObfuscatedName("nf.aw(II)Z")
    public boolean method5770(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3705.method6895();
        this.field3705.method6873(arg0);
        this.field3706.method6873(arg0);
        if (this.method6021()) {
            this.method5841();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("nf.ad(II)Z")
    public boolean method5790(int arg0) {
        this.field3705.method6918(arg0);
        if (this.method6021()) {
            this.method5841();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nf.al(II)Z")
    public boolean method5920(int arg0) {
        this.field3719 = arg0;
        if (this.method6021()) {
            this.method5841();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nf.as(III)Z")
    public boolean method5773(int arg0, int arg1) {
        if (!this.method5913()) {
            this.field3707 = arg0;
            this.field3723 = arg1;
            return false;
        }
        int var3 = this.field3707;
        int var4 = this.field3723;
        int var5 = Math.max(0, this.field3705.method6890() - this.field3720 + 2);
        int var6 = Math.max(0, this.field3705.method6891() - this.field3718 + 1);
        this.field3707 = Math.max(0, Math.min(var5, arg0));
        this.field3723 = Math.max(0, Math.min(var6, arg1));
        return this.field3707 != var3 || this.field3723 != var4;
    }

    @ObfuscatedName("nf.ag(III)Z")
    public boolean method5774(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3705.method6878(arg0, arg1) : false;
    }

    @ObfuscatedName("nf.ai(IB)V")
    public void method5775(int arg0) {
        this.field3705.method6872(arg0);
    }

    @ObfuscatedName("nf.ax(II)V")
    public void method5776(int arg0) {
        this.field3711 = arg0;
    }

    @ObfuscatedName("nf.ar(IB)V")
    public void method5777(int arg0) {
        this.field3705.method6877(arg0);
    }

    @ObfuscatedName("nf.aj(IB)V")
    public void method5865(int arg0) {
        this.field3705.method6976(arg0);
    }

    @ObfuscatedName("nf.au(II)Z")
    public boolean method5779(int arg0) {
        this.field3713 = arg0;
        String var2 = this.field3705.method6897();
        int var3 = var2.length();
        String var4 = this.method5965(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3705.method6889(var4);
        this.method5773(this.field3707, this.field3723);
        this.method6021();
        this.method5841();
        return true;
    }

    @ObfuscatedName("nf.ay(I)V")
    public void method5780() {
        this.field3710 = false;
    }

    @ObfuscatedName("nf.ap(II)Z")
    public boolean method5804(int arg0) {
        if (this.method5863(arg0)) {
            this.method5860();
            class416 var2 = this.field3705.method6881((char) arg0, this.field3714, this.field3700);
            this.method5788(var2.method7005(), var2.method7005());
            this.method6021();
            this.method5841();
        }
        return true;
    }

    @ObfuscatedName("nf.av(I)V")
    public void method5782() {
        if (!this.method5860() && this.field3714 > 0) {
            int var1 = this.field3705.method6937(this.field3714 - 1);
            this.method5841();
            this.method5788(var1, var1);
        }
    }

    @ObfuscatedName("nf.aa(I)V")
    public void method5783() {
        if (!this.method5860() && this.field3714 < this.field3705.method6871()) {
            int var1 = this.field3705.method6937(this.field3714);
            this.method5841();
            this.method5788(var1, var1);
        }
    }

    @ObfuscatedName("nf.aq(B)V")
    public void method5784() {
        if (!this.method5860() && this.field3714 > 0) {
            class506 var1 = this.method5834(this.field3714 - 1);
            int var2 = this.field3705.method6887((Integer) var1.field5091, this.field3714);
            this.method5841();
            this.method5788(var2, var2);
        }
    }

    @ObfuscatedName("nf.am(I)V")
    public void method5785() {
        if (!this.method5860() && this.field3714 < this.field3705.method6871()) {
            class506 var1 = this.method5834(this.field3714);
            int var2 = this.field3705.method6887(this.field3714, (Integer) var1.field5090);
            this.method5841();
            this.method5788(var2, var2);
        }
    }

    @ObfuscatedName("nf.ac(I)Z")
    public boolean method5860() {
        if (this.method5781()) {
            int var1 = this.field3705.method6887(this.field3715, this.field3714);
            this.method5841();
            this.method5788(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nf.ae(I)V")
    public void method5787() {
        this.method5788(0, this.field3705.method6871());
    }

    @ObfuscatedName("nf.ak(III)Z")
    public boolean method5788(int arg0, int arg1) {
        if (!this.method5913()) {
            this.field3715 = arg0;
            this.field3714 = arg1;
            return false;
        }
        if (arg0 > this.field3705.method6871()) {
            arg0 = this.field3705.method6871();
        }
        if (arg1 > this.field3705.method6871()) {
            arg1 = this.field3705.method6871();
        }
        boolean var3 = this.field3715 != arg0 || this.field3714 != arg1;
        this.field3715 = arg0;
        if (this.field3714 != arg1) {
            this.field3714 = arg1;
            this.field3709 = 0;
            this.method5839();
        }
        if (var3 && this.field3725 != null) {
            this.field3725.method2567();
        }
        return var3;
    }

    @ObfuscatedName("nf.bp(ZI)V")
    public void method5789(boolean arg0) {
        class506 var2 = this.method5835(this.field3714);
        this.method5837((Integer) var2.field5091, arg0);
    }

    @ObfuscatedName("nf.bz(ZB)V")
    public void method5819(boolean arg0) {
        class506 var2 = this.method5835(this.field3714);
        this.method5837((Integer) var2.field5090, arg0);
    }

    @ObfuscatedName("nf.bc(ZI)V")
    public void method5791(boolean arg0) {
        this.method5837(0, arg0);
    }

    @ObfuscatedName("nf.bf(ZI)V")
    public void method5902(boolean arg0) {
        this.method5837(this.field3705.method6871(), arg0);
    }

    @ObfuscatedName("nf.be(ZI)V")
    public void method5793(boolean arg0) {
        if (this.method5781() && !arg0) {
            this.method5837(Math.min(this.field3715, this.field3714), arg0);
        } else if (this.field3714 > 0) {
            this.method5837(this.field3714 - 1, arg0);
        }
    }

    @ObfuscatedName("nf.bn(ZB)V")
    public void method5887(boolean arg0) {
        if (this.method5781() && !arg0) {
            this.method5837(Math.max(this.field3715, this.field3714), arg0);
        } else if (this.field3714 < this.field3705.method6871()) {
            this.method5837(this.field3714 + 1, arg0);
        }
    }

    @ObfuscatedName("nf.bd(ZB)V")
    public void method5958(boolean arg0) {
        if (this.field3714 > 0) {
            class506 var2 = this.method5834(this.field3714 - 1);
            this.method5837((Integer) var2.field5091, arg0);
        }
    }

    @ObfuscatedName("nf.bo(ZI)V")
    public void method5796(boolean arg0) {
        if (this.field3714 < this.field3705.method6871()) {
            class506 var2 = this.method5834(this.field3714 + 1);
            this.method5837((Integer) var2.field5090, arg0);
        }
    }

    @ObfuscatedName("nf.bx(ZI)V")
    public void method5815(boolean arg0) {
        if (this.field3714 > 0) {
            this.method5837(this.field3705.method6959(this.field3714, -1), arg0);
        }
    }

    @ObfuscatedName("nf.bl(ZI)V")
    public void method5798(boolean arg0) {
        if (this.field3714 < this.field3705.method6871()) {
            this.method5837(this.field3705.method6959(this.field3714, 1), arg0);
        }
    }

    @ObfuscatedName("nf.bh(ZI)V")
    public void method5799(boolean arg0) {
        if (this.field3714 > 0) {
            int var2 = this.method5821();
            this.method5837(this.field3705.method6959(this.field3714, -var2), arg0);
        }
    }

    @ObfuscatedName("nf.bs(ZB)V")
    public void method5800(boolean arg0) {
        if (this.field3714 < this.field3705.method6871()) {
            int var2 = this.method5821();
            this.method5837(this.field3705.method6959(this.field3714, var2), arg0);
        }
    }

    @ObfuscatedName("nf.bj(ZB)V")
    public void method5844(boolean arg0) {
        class419 var2 = this.field3705.method6880(0, this.field3714);
        class506 var3 = var2.method7120();
        this.method5837(this.field3705.method6945((Integer) var3.field5091, this.field3723), arg0);
    }

    @ObfuscatedName("nf.bu(ZB)V")
    public void method5802(boolean arg0) {
        class419 var2 = this.field3705.method6880(0, this.field3714);
        class506 var3 = var2.method7120();
        this.method5837(this.field3705.method6945((Integer) var3.field5091, this.field3723 + this.field3718), arg0);
    }

    @ObfuscatedName("nf.br(IIZZI)V")
    public void method5803(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3710) {
            int var7 = this.field3707 + arg0;
            int var8 = this.field3723 + arg1;
            class506 var9 = this.method5843();
            var6 = this.field3705.method6945(var7 - (Integer) var9.field5091, var8 - (Integer) var9.field5090);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3712 = 1;
            class506 var10 = this.method5834(var6);
            class506 var11 = this.method5834(this.field3716);
            this.method5833(var11, var10);
        } else if (arg2) {
            this.field3712 = 1;
            class506 var12 = this.method5834(var6);
            this.method5788((Integer) var12.field5091, (Integer) var12.field5090);
            this.field3716 = (Integer) var12.field5091;
        } else if (arg3) {
            this.method5788(this.field3716, var6);
        } else {
            if (this.field3704 <= 0 || this.field3716 != var6) {
                this.field3712 = 0;
                this.method5788(var6, var6);
                this.field3716 = var6;
            } else if (this.field3715 == this.field3714) {
                this.field3712 = 1;
                class506 var13 = this.method5834(var6);
                this.method5788((Integer) var13.field5091, (Integer) var13.field5090);
            } else {
                this.field3712 = 2;
                class506 var14 = this.method5835(var6);
                this.method5788((Integer) var14.field5091, (Integer) var14.field5090);
            }
            this.field3704 = 25;
        }
    }

    @ObfuscatedName("nf.bb(IIB)V")
    public void method5795(int arg0, int arg1) {
        if (!this.field3710 || !this.method5859()) {
            return;
        }
        int var3 = this.field3707 + arg0;
        int var4 = this.field3723 + arg1;
        class506 var5 = this.method5843();
        int var6 = this.field3705.method6945(var3 - (Integer) var5.field5091, var4 - (Integer) var5.field5090);
        switch(this.field3712) {
            case 0:
                this.method5788(this.field3715, var6);
                break;
            case 1:
                class506 var9 = this.method5834(this.field3716);
                class506 var10 = this.method5834(var6);
                this.method5833(var9, var10);
                break;
            case 2:
                class506 var7 = this.method5835(this.field3716);
                class506 var8 = this.method5835(var6);
                this.method5833(var7, var8);
        }
    }

    @ObfuscatedName("nf.by(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5805(Clipboard arg0) {
        class419 var2 = this.field3705.method6880(this.field3715, this.field3714);
        if (!var2.method7135()) {
            String var3 = var2.method7115();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("nf.bk(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5820(Clipboard arg0) {
        if (this.method5781()) {
            this.method5805(arg0);
            this.method5860();
        }
    }

    @ObfuscatedName("nf.bt(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method5918(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method5965((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5860();
            class416 var4 = this.field3705.method6882(var3, this.field3714, this.field3700);
            this.method5788(var4.method7005(), var4.method7005());
            this.method6021();
            this.method5841();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("nf.bq(I)V")
    public void method5991() {
        this.field3723 = Math.max(0, this.field3723 - this.field3705.method6869());
    }

    @ObfuscatedName("nf.bi(I)V")
    public void method5801() {
        int var1 = Math.max(0, this.field3705.method6891() - this.field3718);
        this.field3723 = Math.min(var1, this.field3723 + this.field3705.method6869());
    }

    @ObfuscatedName("nf.bw(Lnc;I)V")
    public void method5810(class340 arg0) {
        this.field3724 = arg0;
    }

    @ObfuscatedName("nf.bm(Lnc;I)V")
    public void method5811(class340 arg0) {
        this.field3725 = arg0;
    }

    @ObfuscatedName("nf.ba(B)Lpl;")
    public class415 method5812() {
        return this.field3705;
    }

    @ObfuscatedName("nf.bv(I)Lpl;")
    public class415 method5813() {
        return this.field3706;
    }

    @ObfuscatedName("nf.bg(B)Lqs;")
    public class419 method5831() {
        return this.field3705.method6880(this.field3715, this.field3714);
    }

    @ObfuscatedName("nf.cb(B)Z")
    public boolean method5859() {
        return this.field3721;
    }

    @ObfuscatedName("nf.cj(I)Z")
    public boolean method5816() {
        return this.field3708;
    }

    @ObfuscatedName("nf.cr(I)Z")
    public boolean method6016() {
        return this.method5859() && this.field3709 % 60 < 30;
    }

    @ObfuscatedName("nf.cy(B)I")
    public int method5910() {
        return this.field3714;
    }

    @ObfuscatedName("nf.cg(I)I")
    public int method5959() {
        return this.field3715;
    }

    @ObfuscatedName("nf.cl(B)Z")
    public boolean method5913() {
        return this.field3710;
    }

    @ObfuscatedName("nf.cw(I)I")
    public int method5873() {
        return this.field3707;
    }

    @ObfuscatedName("nf.ci(I)I")
    public int method5822() {
        return this.field3723;
    }

    @ObfuscatedName("nf.ct(I)I")
    public int method5823() {
        return this.field3705.method6895();
    }

    @ObfuscatedName("nf.cm(I)I")
    public int method5824() {
        return this.field3705.method7000();
    }

    @ObfuscatedName("nf.cd(I)I")
    public int method5825() {
        return this.field3719;
    }

    @ObfuscatedName("nf.cc(B)I")
    public int method5974() {
        return this.field3711;
    }

    @ObfuscatedName("nf.cn(I)I")
    public int method5827() {
        return this.field3705.method6898();
    }

    @ObfuscatedName("nf.ce(I)I")
    public int method5828() {
        return this.field3713;
    }

    @ObfuscatedName("nf.cp(I)I")
    public int method5829() {
        return this.field3705.method6892();
    }

    @ObfuscatedName("nf.cu(B)Z")
    public boolean method5830() {
        return this.method5824() > 1;
    }

    @ObfuscatedName("nf.ck(B)Z")
    public boolean method5781() {
        return this.field3715 != this.field3714;
    }

    @ObfuscatedName("nf.cs(Ljava/lang/String;I)Ljava/lang/String;")
    public String method5965(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method5863(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("nf.cv(Ltd;Ltd;B)V")
    public void method5833(class506 arg0, class506 arg1) {
        if ((Integer) arg1.field5091 < (Integer) arg0.field5091) {
            this.method5788((Integer) arg0.field5090, (Integer) arg1.field5091);
        } else {
            this.method5788((Integer) arg0.field5091, (Integer) arg1.field5090);
        }
    }

    @ObfuscatedName("nf.co(IB)Ltd;")
    public class506 method5834(int arg0) {
        int var2 = this.field3705.method6871();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method5840(this.field3705.method6867(var5 - 1).field4608)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method5840(this.field3705.method6867(var6).field4608)) {
                var4 = var6;
                break;
            }
        }
        return new class506(var3, var4);
    }

    @ObfuscatedName("nf.cz(II)Ltd;")
    public class506 method5835(int arg0) {
        int var2 = this.field3705.method6871();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3705.method6867(var5 - 1).field4608 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3705.method6867(var6).field4608 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class506(var3, var4);
    }

    @ObfuscatedName("nf.ch(I)Z")
    public boolean method6021() {
        if (!this.method5913()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3705.method6871() > this.field3719) {
            this.field3705.method6887(this.field3719, this.field3705.method6871());
            var1 = true;
        }
        int var2 = this.method5824();
        if (this.field3705.method6893() > var2) {
            int var3 = this.field3705.method6959(0, var2) - 1;
            this.field3705.method6887(var3, this.field3705.method6871());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3714;
            int var5 = this.field3715;
            int var6 = this.field3705.method6871();
            if (this.field3714 > var6) {
                var4 = var6;
            }
            if (this.field3715 > var6) {
                var5 = var6;
            }
            this.method5788(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("nf.cf(IZS)V")
    public void method5837(int arg0, boolean arg1) {
        if (arg1) {
            this.method5788(this.field3715, arg0);
        } else {
            this.method5788(arg0, arg0);
        }
    }

    @ObfuscatedName("nf.cx(I)I")
    public int method5821() {
        return this.field3718 / this.field3705.method6869();
    }

    @ObfuscatedName("nf.cq(B)V")
    public void method5839() {
        class419 var1 = this.field3705.method6880(0, this.field3714);
        class506 var2 = var1.method7120();
        int var3 = this.field3705.method6869();
        int var4 = (Integer) var2.field5091 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5090 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3707;
        int var9 = this.field3720 + var8;
        int var10 = this.field3723;
        int var11 = this.field3718 + var10;
        int var12 = this.field3707;
        int var13 = this.field3723;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3720;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3718;
        }
        this.method5773(var12, var13);
    }

    @ObfuscatedName("nf.ca(II)Z")
    public boolean method5840(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("nf.dj(I)V")
    public void method5841() {
        if (this.field3724 != null) {
            this.field3724.method2567();
        }
    }

    @ObfuscatedName("nf.dn(II)Z")
    public boolean method5863(int arg0) {
        switch(this.field3713) {
            case 1:
                return Statics.method3599((char) arg0);
            case 2:
                return Statics.method2791((char) arg0);
            case 3:
                return class407.method6479((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class407.method6479(var2)) {
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

    @ObfuscatedName("nf.dl(I)Ltd;")
    public class506 method5843() {
        int var1 = this.field3705.method6907(this.field3720);
        int var2 = this.field3705.method6900(this.field3718);
        return new class506(var1, var2);
    }
}
