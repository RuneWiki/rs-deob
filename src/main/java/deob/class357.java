package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("ny")
public class class357 {

    @ObfuscatedName("ny.ay")
    public class433 field3793 = new class433();

    @ObfuscatedName("ny.ao")
    public class433 field3794 = new class433();

    @ObfuscatedName("ny.aa")
    public boolean field3803 = false;

    @ObfuscatedName("ny.as")
    public boolean field3806 = true;

    @ObfuscatedName("ny.aw")
    public int field3797 = 0;

    @ObfuscatedName("ny.at")
    public boolean field3790 = false;

    @ObfuscatedName("ny.af")
    public int field3799 = 0;

    @ObfuscatedName("ny.am")
    public int field3804 = 0;

    @ObfuscatedName("ny.ar")
    public int field3801 = 0;

    @ObfuscatedName("ny.bt")
    public int field3800 = 0;

    @ObfuscatedName("ny.bj")
    public int field3810 = 0;

    @ObfuscatedName("ny.be")
    public int field3795 = 0;

    @ObfuscatedName("ny.bm")
    public int field3805 = 0;

    @ObfuscatedName("ny.bo")
    public int field3814 = Integer.MAX_VALUE;

    @ObfuscatedName("ny.bi")
    public int field3807 = Integer.MAX_VALUE;

    @ObfuscatedName("ny.ba")
    public int field3808 = 0;

    @ObfuscatedName("ny.bg")
    public int field3809 = 0;

    @ObfuscatedName("ny.bs")
    public int field3787 = 0;

    @ObfuscatedName("ny.bp")
    public int field3813 = 0;

    @ObfuscatedName("ny.bx")
    public class349 field3812;

    @ObfuscatedName("ny.bu")
    public class349 field3798;

    public class357() {
        this.field3793.method7274(1);
        this.field3794.method7274(1);
    }

    @ObfuscatedName("ny.aq(B)V")
    public void method6208() {
        this.field3797 = (this.field3797 + 1) % 60;
        if (this.field3805 > 0) {
            this.field3805--;
        }
    }

    @ObfuscatedName("ny.ad(ZB)Z")
    public boolean method6139(boolean arg0) {
        boolean var2 = arg0 && this.field3806;
        boolean var3 = this.field3803 != var2;
        this.field3803 = var2;
        if (!this.field3803) {
            this.method5984(this.field3800, this.field3800);
        }
        return var3;
    }

    @ObfuscatedName("ny.ag(ZI)V")
    public void method5961(boolean arg0) {
        this.field3806 = arg0;
        this.field3803 = arg0 && this.field3803;
    }

    @ObfuscatedName("ny.ak(Ljava/lang/String;I)Z")
    public boolean method6034(String arg0) {
        String var2 = this.field3793.method7269();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method6028(arg0);
        this.field3793.method7385(var3);
        this.method5984(this.field3810, this.field3800);
        this.method6106(this.field3787, this.field3813);
        this.method6032();
        this.method6037();
        return true;
    }

    @ObfuscatedName("ny.ap(Ljava/lang/String;I)Z")
    public boolean method5963(String arg0) {
        this.field3794.method7385(arg0);
        return true;
    }

    @ObfuscatedName("ny.an(Lqz;B)Z")
    public boolean method6171(class436 arg0) {
        boolean var2 = !this.field3790;
        this.field3793.method7319(arg0);
        this.field3794.method7319(arg0);
        this.field3790 = true;
        boolean var3 = var2 | this.method6106(this.field3787, this.field3813);
        boolean var4 = var3 | this.method5984(this.field3810, this.field3800);
        if (this.method6032()) {
            this.method6037();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("ny.aj(III)Z")
    public boolean method6013(int arg0, int arg1) {
        boolean var3 = this.field3808 != arg0 || this.field3809 != arg1;
        this.field3808 = arg0;
        this.field3809 = arg1;
        return var3 | this.method6106(this.field3787, this.field3813);
    }

    @ObfuscatedName("ny.av(IB)Z")
    public boolean method6092(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3793.method7289();
        this.field3793.method7354(arg0);
        this.field3794.method7354(arg0);
        if (this.method6032()) {
            this.method6037();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("ny.ab(IS)Z")
    public boolean method5967(int arg0) {
        this.field3793.method7375(arg0);
        if (this.method6032()) {
            this.method6037();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ny.ai(II)Z")
    public boolean method5968(int arg0) {
        this.field3807 = arg0;
        if (this.method6032()) {
            this.method6037();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ny.ae(IIB)Z")
    public boolean method6106(int arg0, int arg1) {
        if (!this.method6016()) {
            this.field3787 = arg0;
            this.field3813 = arg1;
            return false;
        }
        int var3 = this.field3787;
        int var4 = this.field3813;
        int var5 = Math.max(0, this.field3793.method7286() - this.field3808 + 2);
        int var6 = Math.max(0, this.field3793.method7287() - this.field3809 + 1);
        this.field3787 = Math.max(0, Math.min(var5, arg0));
        this.field3813 = Math.max(0, Math.min(var6, arg1));
        return this.field3787 != var3 || this.field3813 != var4;
    }

    @ObfuscatedName("ny.au(III)Z")
    public boolean method6025(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3793.method7374(arg0, arg1) : false;
    }

    @ObfuscatedName("ny.ah(II)V")
    public void method5996(int arg0) {
        this.field3793.method7276(arg0);
    }

    @ObfuscatedName("ny.az(IB)V")
    public void method6125(int arg0) {
        this.field3799 = arg0;
    }

    @ObfuscatedName("ny.ax(IB)V")
    public void method5973(int arg0) {
        this.field3793.method7274(arg0);
    }

    @ObfuscatedName("ny.ac(IB)V")
    public void method5989(int arg0) {
        this.field3793.method7272(arg0);
    }

    @ObfuscatedName("ny.al(II)Z")
    public boolean method5975(int arg0) {
        this.field3801 = arg0;
        String var2 = this.field3793.method7269();
        int var3 = var2.length();
        String var4 = this.method6028(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3793.method7385(var4);
        this.method6106(this.field3787, this.field3813);
        this.method6032();
        this.method6037();
        return true;
    }

    @ObfuscatedName("ny.ay(I)V")
    public void method5976() {
        this.field3790 = false;
    }

    @ObfuscatedName("ny.ao(II)Z")
    public boolean method5977(int arg0) {
        if (this.method6038(arg0)) {
            this.method5982();
            class434 var2 = this.field3793.method7364((char) arg0, this.field3800, this.field3814);
            this.method5984(var2.method7420(), var2.method7420());
            this.method6032();
            this.method6037();
        }
        return true;
    }

    @ObfuscatedName("ny.aa(B)V")
    public void method6162() {
        if (!this.method5982() && this.field3800 > 0) {
            int var1 = this.field3793.method7326(this.field3800 - 1);
            this.method6037();
            this.method5984(var1, var1);
        }
    }

    @ObfuscatedName("ny.as(I)V")
    public void method5979() {
        if (!this.method5982() && this.field3800 < this.field3793.method7329()) {
            int var1 = this.field3793.method7326(this.field3800);
            this.method6037();
            this.method5984(var1, var1);
        }
    }

    @ObfuscatedName("ny.aw(I)V")
    public void method5980() {
        if (!this.method5982() && this.field3800 > 0) {
            class518 var1 = this.method6122(this.field3800 - 1);
            int var2 = this.field3793.method7283((Integer) var1.field5226, this.field3800);
            this.method6037();
            this.method5984(var2, var2);
        }
    }

    @ObfuscatedName("ny.at(B)V")
    public void method5958() {
        if (!this.method5982() && this.field3800 < this.field3793.method7329()) {
            class518 var1 = this.method6122(this.field3800);
            int var2 = this.field3793.method7283(this.field3800, (Integer) var1.field5223);
            this.method6037();
            this.method5984(var2, var2);
        }
    }

    @ObfuscatedName("ny.af(S)Z")
    public boolean method5982() {
        if (this.method6027()) {
            int var1 = this.field3793.method7283(this.field3810, this.field3800);
            this.method6037();
            this.method5984(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ny.am(I)V")
    public void method6030() {
        this.method5984(0, this.field3793.method7329());
    }

    @ObfuscatedName("ny.ar(III)Z")
    public boolean method5984(int arg0, int arg1) {
        if (!this.method6016()) {
            this.field3810 = arg0;
            this.field3800 = arg1;
            return false;
        }
        if (arg0 > this.field3793.method7329()) {
            arg0 = this.field3793.method7329();
        }
        if (arg1 > this.field3793.method7329()) {
            arg1 = this.field3793.method7329();
        }
        boolean var3 = this.field3810 != arg0 || this.field3800 != arg1;
        this.field3810 = arg0;
        if (this.field3800 != arg1) {
            this.field3800 = arg1;
            this.field3797 = 0;
            this.method6228();
        }
        if (var3 && this.field3798 != null) {
            this.field3798.method2662();
        }
        return var3;
    }

    @ObfuscatedName("ny.bt(ZI)V")
    public void method5985(boolean arg0) {
        class518 var2 = this.method6031(this.field3800);
        this.method6004((Integer) var2.field5226, arg0);
    }

    @ObfuscatedName("ny.bj(ZB)V")
    public void method5986(boolean arg0) {
        class518 var2 = this.method6031(this.field3800);
        this.method6004((Integer) var2.field5223, arg0);
    }

    @ObfuscatedName("ny.be(ZB)V")
    public void method6169(boolean arg0) {
        this.method6004(0, arg0);
    }

    @ObfuscatedName("ny.bm(ZB)V")
    public void method5988(boolean arg0) {
        this.method6004(this.field3793.method7329(), arg0);
    }

    @ObfuscatedName("ny.bo(ZB)V")
    public void method6141(boolean arg0) {
        if (this.method6027() && !arg0) {
            this.method6004(Math.min(this.field3810, this.field3800), arg0);
        } else if (this.field3800 > 0) {
            this.method6004(this.field3800 - 1, arg0);
        }
    }

    @ObfuscatedName("ny.bi(ZI)V")
    public void method5990(boolean arg0) {
        if (this.method6027() && !arg0) {
            this.method6004(Math.max(this.field3810, this.field3800), arg0);
        } else if (this.field3800 < this.field3793.method7329()) {
            this.method6004(this.field3800 + 1, arg0);
        }
    }

    @ObfuscatedName("ny.ba(ZB)V")
    public void method5991(boolean arg0) {
        if (this.field3800 > 0) {
            class518 var2 = this.method6122(this.field3800 - 1);
            this.method6004((Integer) var2.field5226, arg0);
        }
    }

    @ObfuscatedName("ny.bg(ZB)V")
    public void method5978(boolean arg0) {
        if (this.field3800 < this.field3793.method7329()) {
            class518 var2 = this.method6122(this.field3800 + 1);
            this.method6004((Integer) var2.field5223, arg0);
        }
    }

    @ObfuscatedName("ny.bs(ZB)V")
    public void method6170(boolean arg0) {
        if (this.field3800 > 0) {
            this.method6004(this.field3793.method7285(this.field3800, -1), arg0);
        }
    }

    @ObfuscatedName("ny.bp(ZI)V")
    public void method5994(boolean arg0) {
        if (this.field3800 < this.field3793.method7329()) {
            this.method6004(this.field3793.method7285(this.field3800, 1), arg0);
        }
    }

    @ObfuscatedName("ny.bx(ZS)V")
    public void method5995(boolean arg0) {
        if (this.field3800 > 0) {
            int var2 = this.method6146();
            this.method6004(this.field3793.method7285(this.field3800, -var2), arg0);
        }
    }

    @ObfuscatedName("ny.bu(ZI)V")
    public void method6118(boolean arg0) {
        if (this.field3800 < this.field3793.method7329()) {
            int var2 = this.method6146();
            this.method6004(this.field3793.method7285(this.field3800, var2), arg0);
        }
    }

    @ObfuscatedName("ny.by(ZB)V")
    public void method5983(boolean arg0) {
        class437 var2 = this.field3793.method7277(0, this.field3800);
        class518 var3 = var2.method7538();
        this.method6004(this.field3793.method7271((Integer) var3.field5226, this.field3813), arg0);
    }

    @ObfuscatedName("ny.bw(ZB)V")
    public void method5998(boolean arg0) {
        class437 var2 = this.field3793.method7277(0, this.field3800);
        class518 var3 = var2.method7538();
        this.method6004(this.field3793.method7271((Integer) var3.field5226, this.field3813 + this.field3809), arg0);
    }

    @ObfuscatedName("ny.bl(IIZZB)V")
    public void method5999(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3790) {
            int var7 = this.field3787 + arg0;
            int var8 = this.field3813 + arg1;
            class518 var9 = this.method6039();
            var6 = this.field3793.method7271(var7 - (Integer) var9.field5226, var8 - (Integer) var9.field5223);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3804 = 1;
            class518 var10 = this.method6122(var6);
            class518 var11 = this.method6122(this.field3795);
            this.method6029(var11, var10);
        } else if (arg2) {
            this.field3804 = 1;
            class518 var12 = this.method6122(var6);
            this.method5984((Integer) var12.field5226, (Integer) var12.field5223);
            this.field3795 = (Integer) var12.field5226;
        } else if (arg3) {
            this.method5984(this.field3795, var6);
        } else {
            if (this.field3805 <= 0 || this.field3795 != var6) {
                this.field3804 = 0;
                this.method5984(var6, var6);
                this.field3795 = var6;
            } else if (this.field3810 == this.field3800) {
                this.field3804 = 1;
                class518 var13 = this.method6122(var6);
                this.method5984((Integer) var13.field5226, (Integer) var13.field5223);
            } else {
                this.field3804 = 2;
                class518 var14 = this.method6031(var6);
                this.method5984((Integer) var14.field5226, (Integer) var14.field5223);
            }
            this.field3805 = 25;
        }
    }

    @ObfuscatedName("ny.bc(IIB)V")
    public void method6000(int arg0, int arg1) {
        if (!this.field3790 || !this.method6011()) {
            return;
        }
        int var3 = this.field3787 + arg0;
        int var4 = this.field3813 + arg1;
        class518 var5 = this.method6039();
        int var6 = this.field3793.method7271(var3 - (Integer) var5.field5226, var4 - (Integer) var5.field5223);
        switch(this.field3804) {
            case 0:
                this.method5984(this.field3810, var6);
                break;
            case 1:
                class518 var9 = this.method6122(this.field3795);
                class518 var10 = this.method6122(var6);
                this.method6029(var9, var10);
                break;
            case 2:
                class518 var7 = this.method6031(this.field3795);
                class518 var8 = this.method6031(var6);
                this.method6029(var7, var8);
        }
    }

    @ObfuscatedName("ny.bv(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6001(Clipboard arg0) {
        class437 var2 = this.field3793.method7277(this.field3810, this.field3800);
        if (!var2.method7534()) {
            String var3 = var2.method7532();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("ny.bb(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6002(Clipboard arg0) {
        if (this.method6027()) {
            this.method6001(arg0);
            this.method5982();
        }
    }

    @ObfuscatedName("ny.bn(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6124(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method6028((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method5982();
            class434 var4 = this.field3793.method7390(var3, this.field3800, this.field3814);
            this.method5984(var4.method7420(), var4.method7420());
            this.method6032();
            this.method6037();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("ny.bh(I)V")
    public void method6010() {
        this.field3813 = Math.max(0, this.field3813 - this.field3793.method7288());
    }

    @ObfuscatedName("ny.bq(I)V")
    public void method6005() {
        int var1 = Math.max(0, this.field3793.method7287() - this.field3809);
        this.field3813 = Math.min(var1, this.field3813 + this.field3793.method7288());
    }

    @ObfuscatedName("ny.bd(Lnj;I)V")
    public void method6006(class349 arg0) {
        this.field3812 = arg0;
    }

    @ObfuscatedName("ny.bz(Lnj;I)V")
    public void method6007(class349 arg0) {
        this.field3798 = arg0;
    }

    @ObfuscatedName("ny.bk(I)Lql;")
    public class433 method6008() {
        return this.field3793;
    }

    @ObfuscatedName("ny.br(B)Lql;")
    public class433 method6051() {
        return this.field3794;
    }

    @ObfuscatedName("ny.bf(B)Lqw;")
    public class437 method6173() {
        return this.field3793.method7277(this.field3810, this.field3800);
    }

    @ObfuscatedName("ny.cf(I)Z")
    public boolean method6011() {
        return this.field3803;
    }

    @ObfuscatedName("ny.cv(I)Z")
    public boolean method6012() {
        return this.field3806;
    }

    @ObfuscatedName("ny.cl(B)Z")
    public boolean method6214() {
        return this.method6011() && this.field3797 % 60 < 30;
    }

    @ObfuscatedName("ny.cm(B)I")
    public int method6155() {
        return this.field3800;
    }

    @ObfuscatedName("ny.cg(I)I")
    public int method6015() {
        return this.field3810;
    }

    @ObfuscatedName("ny.cu(B)Z")
    public boolean method6016() {
        return this.field3790;
    }

    @ObfuscatedName("ny.cn(I)I")
    public int method6017() {
        return this.field3787;
    }

    @ObfuscatedName("ny.ce(I)I")
    public int method6018() {
        return this.field3813;
    }

    @ObfuscatedName("ny.co(I)I")
    public int method6019() {
        return this.field3793.method7289();
    }

    @ObfuscatedName("ny.ch(I)I")
    public int method6020() {
        return this.field3793.method7338();
    }

    @ObfuscatedName("ny.ct(I)I")
    public int method6021() {
        return this.field3807;
    }

    @ObfuscatedName("ny.cd(B)I")
    public int method6160() {
        return this.field3799;
    }

    @ObfuscatedName("ny.ck(B)I")
    public int method6023() {
        return this.field3793.method7293();
    }

    @ObfuscatedName("ny.cq(I)I")
    public int method6024() {
        return this.field3801;
    }

    @ObfuscatedName("ny.cs(B)I")
    public int method6206() {
        return this.field3793.method7294();
    }

    @ObfuscatedName("ny.cp(I)Z")
    public boolean method6026() {
        return this.method6020() > 1;
    }

    @ObfuscatedName("ny.cy(I)Z")
    public boolean method6027() {
        return this.field3810 != this.field3800;
    }

    @ObfuscatedName("ny.cw(Ljava/lang/String;I)Ljava/lang/String;")
    public String method6028(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method6038(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("ny.ci(Ltu;Ltu;I)V")
    public void method6029(class518 arg0, class518 arg1) {
        if ((Integer) arg1.field5226 < (Integer) arg0.field5226) {
            this.method5984((Integer) arg0.field5223, (Integer) arg1.field5226);
        } else {
            this.method5984((Integer) arg0.field5226, (Integer) arg1.field5223);
        }
    }

    @ObfuscatedName("ny.cc(IB)Ltu;")
    public class518 method6122(int arg0) {
        int var2 = this.field3793.method7329();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method6036(this.field3793.method7264(var5 - 1).field4764)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method6036(this.field3793.method7264(var6).field4764)) {
                var4 = var6;
                break;
            }
        }
        return new class518(var3, var4);
    }

    @ObfuscatedName("ny.cr(IB)Ltu;")
    public class518 method6031(int arg0) {
        int var2 = this.field3793.method7329();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3793.method7264(var5 - 1).field4764 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3793.method7264(var6).field4764 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class518(var3, var4);
    }

    @ObfuscatedName("ny.cb(B)Z")
    public boolean method6032() {
        if (!this.method6016()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3793.method7329() > this.field3807) {
            this.field3793.method7283(this.field3807, this.field3793.method7329());
            var1 = true;
        }
        int var2 = this.method6020();
        if (this.field3793.method7380() > var2) {
            int var3 = this.field3793.method7285(0, var2) - 1;
            this.field3793.method7283(var3, this.field3793.method7329());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3800;
            int var5 = this.field3810;
            int var6 = this.field3793.method7329();
            if (this.field3800 > var6) {
                var4 = var6;
            }
            if (this.field3810 > var6) {
                var5 = var6;
            }
            this.method5984(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("ny.cz(IZI)V")
    public void method6004(int arg0, boolean arg1) {
        if (arg1) {
            this.method5984(this.field3810, arg0);
        } else {
            this.method5984(arg0, arg0);
        }
    }

    @ObfuscatedName("ny.cj(I)I")
    public int method6146() {
        return this.field3809 / this.field3793.method7288();
    }

    @ObfuscatedName("ny.cx(I)V")
    public void method6228() {
        class437 var1 = this.field3793.method7277(0, this.field3800);
        class518 var2 = var1.method7538();
        int var3 = this.field3793.method7288();
        int var4 = (Integer) var2.field5226 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5223 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3787;
        int var9 = this.field3808 + var8;
        int var10 = this.field3813;
        int var11 = this.field3809 + var10;
        int var12 = this.field3787;
        int var13 = this.field3813;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3808;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3809;
        }
        this.method6106(var12, var13);
    }

    @ObfuscatedName("ny.ca(II)Z")
    public boolean method6036(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("ny.df(B)V")
    public void method6037() {
        if (this.field3812 != null) {
            this.field3812.method2662();
        }
    }

    @ObfuscatedName("ny.dd(IB)Z")
    public boolean method6038(int arg0) {
        switch(this.field3801) {
            case 1:
                return class416.method3280((char) arg0);
            case 2:
                return class416.method5773((char) arg0);
            case 3:
                return class416.method4577((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class416.method4577(var2)) {
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

    @ObfuscatedName("ny.dg(B)Ltu;")
    public class518 method6039() {
        int var1 = this.field3793.method7404(this.field3808);
        int var2 = this.field3793.method7273(this.field3809);
        return new class518(var1, var2);
    }
}
