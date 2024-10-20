package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("nz")
public class class360 {

    @ObfuscatedName("nz.ag")
    public class437 field3833 = new class437();

    @ObfuscatedName("nz.ad")
    public class437 field3842 = new class437();

    @ObfuscatedName("nz.ac")
    public boolean field3843 = false;

    @ObfuscatedName("nz.av")
    public boolean field3844 = true;

    @ObfuscatedName("nz.ax")
    public int field3845 = 0;

    @ObfuscatedName("nz.aq")
    public boolean field3841 = false;

    @ObfuscatedName("nz.al")
    public int field3847 = 0;

    @ObfuscatedName("nz.aa")
    public int field3848 = 0;

    @ObfuscatedName("nz.ah")
    public int field3846 = 0;

    @ObfuscatedName("nz.bh")
    public int field3837 = 0;

    @ObfuscatedName("nz.bj")
    public int field3838 = 0;

    @ObfuscatedName("nz.bv")
    public int field3852 = 0;

    @ObfuscatedName("nz.bx")
    public int field3853 = 0;

    @ObfuscatedName("nz.bk")
    public int field3854 = Integer.MAX_VALUE;

    @ObfuscatedName("nz.bb")
    public int field3850 = Integer.MAX_VALUE;

    @ObfuscatedName("nz.bq")
    public int field3862 = 0;

    @ObfuscatedName("nz.bp")
    public int field3857 = 0;

    @ObfuscatedName("nz.bz")
    public int field3858 = 0;

    @ObfuscatedName("nz.bc")
    public int field3859 = 0;

    @ObfuscatedName("nz.by")
    public class352 field3860;

    @ObfuscatedName("nz.br")
    public class352 field3855;

    public class360() {
        this.field3833.method7775(1);
        this.field3842.method7775(1);
    }

    @ObfuscatedName("nz.ap(B)V")
    public void method6669() {
        this.field3845 = (this.field3845 + 1) % 60;
        if (this.field3853 > 0) {
            this.field3853--;
        }
    }

    @ObfuscatedName("nz.aw(ZI)Z")
    public boolean method6618(boolean arg0) {
        boolean var2 = arg0 && this.field3844;
        boolean var3 = this.field3843 != var2;
        this.field3843 = var2;
        if (!this.field3843) {
            this.method6560(this.field3837, this.field3837);
        }
        return var3;
    }

    @ObfuscatedName("nz.ak(ZI)V")
    public void method6414(boolean arg0) {
        this.field3844 = arg0;
        this.field3843 = arg0 && this.field3843;
    }

    @ObfuscatedName("nz.aj(Ljava/lang/String;B)Z")
    public boolean method6415(String arg0) {
        String var2 = this.field3833.method7781();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method6422(arg0);
        this.field3833.method7793(var3);
        this.method6560(this.field3838, this.field3837);
        this.method6655(this.field3858, this.field3859);
        this.method6441();
        this.method6489();
        return true;
    }

    @ObfuscatedName("nz.ai(Ljava/lang/String;I)Z")
    public boolean method6642(String arg0) {
        this.field3842.method7793(arg0);
        return true;
    }

    @ObfuscatedName("nz.ay(Lqa;I)Z")
    public boolean method6417(class440 arg0) {
        boolean var2 = !this.field3841;
        this.field3833.method7843(arg0);
        this.field3842.method7843(arg0);
        this.field3841 = true;
        boolean var3 = var2 | this.method6655(this.field3858, this.field3859);
        boolean var4 = var3 | this.method6560(this.field3838, this.field3837);
        if (this.method6441()) {
            this.method6489();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("nz.as(III)Z")
    public boolean method6632(int arg0, int arg1) {
        boolean var3 = this.field3862 != arg0 || this.field3857 != arg1;
        this.field3862 = arg0;
        this.field3857 = arg1;
        return var3 | this.method6655(this.field3858, this.field3859);
    }

    @ObfuscatedName("nz.ae(IB)Z")
    public boolean method6419(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3833.method7804();
        this.field3833.method7872(arg0);
        this.field3842.method7872(arg0);
        if (this.method6441()) {
            this.method6489();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("nz.am(II)Z")
    public boolean method6629(int arg0) {
        this.field3833.method7783(arg0);
        if (this.method6441()) {
            this.method6489();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nz.at(II)Z")
    public boolean method6421(int arg0) {
        this.field3850 = arg0;
        if (this.method6441()) {
            this.method6489();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nz.au(III)Z")
    public boolean method6655(int arg0, int arg1) {
        if (!this.method6468()) {
            this.field3858 = arg0;
            this.field3859 = arg1;
            return false;
        }
        int var3 = this.field3858;
        int var4 = this.field3859;
        int var5 = Math.max(0, this.field3833.method7799() - this.field3862 + 2);
        int var6 = Math.max(0, this.field3833.method7796() - this.field3857 + 1);
        this.field3858 = Math.max(0, Math.min(var5, arg0));
        this.field3859 = Math.max(0, Math.min(var6, arg1));
        return this.field3858 != var3 || this.field3859 != var4;
    }

    @ObfuscatedName("nz.an(IIS)Z")
    public boolean method6610(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3833.method7787(arg0, arg1) : false;
    }

    @ObfuscatedName("nz.ao(II)V")
    public void method6515(int arg0) {
        this.field3833.method7788(arg0);
    }

    @ObfuscatedName("nz.af(II)V")
    public void method6425(int arg0) {
        this.field3847 = arg0;
    }

    @ObfuscatedName("nz.ar(II)V")
    public void method6426(int arg0) {
        this.field3833.method7775(arg0);
    }

    @ObfuscatedName("nz.ab(IB)V")
    public void method6427(int arg0) {
        this.field3833.method7791(arg0);
    }

    @ObfuscatedName("nz.az(IB)Z")
    public boolean method6428(int arg0) {
        this.field3846 = arg0;
        String var2 = this.field3833.method7781();
        int var3 = var2.length();
        String var4 = this.method6422(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3833.method7793(var4);
        this.method6655(this.field3858, this.field3859);
        this.method6441();
        this.method6489();
        return true;
    }

    @ObfuscatedName("nz.ag(I)V")
    public void method6429() {
        this.field3841 = false;
    }

    @ObfuscatedName("nz.ad(IB)Z")
    public boolean method6541(int arg0) {
        if (this.method6490(arg0)) {
            this.method6435();
            class438 var2 = this.field3833.method7776((char) arg0, this.field3837, this.field3854);
            this.method6560(var2.method7917(), var2.method7917());
            this.method6441();
            this.method6489();
        }
        return true;
    }

    @ObfuscatedName("nz.ac(B)V")
    public void method6431() {
        if (!this.method6435() && this.field3837 > 0) {
            int var1 = this.field3833.method7795(this.field3837 - 1);
            this.method6489();
            this.method6560(var1, var1);
        }
    }

    @ObfuscatedName("nz.av(B)V")
    public void method6566() {
        if (!this.method6435() && this.field3837 < this.field3833.method7780()) {
            int var1 = this.field3833.method7795(this.field3837);
            this.method6489();
            this.method6560(var1, var1);
        }
    }

    @ObfuscatedName("nz.ax(I)V")
    public void method6599() {
        if (!this.method6435() && this.field3837 > 0) {
            class528 var1 = this.method6623(this.field3837 - 1);
            int var2 = this.field3833.method7887((Integer) var1.field5317, this.field3837);
            this.method6489();
            this.method6560(var2, var2);
        }
    }

    @ObfuscatedName("nz.aq(I)V")
    public void method6434() {
        if (!this.method6435() && this.field3837 < this.field3833.method7780()) {
            class528 var1 = this.method6623(this.field3837);
            int var2 = this.field3833.method7887(this.field3837, (Integer) var1.field5318);
            this.method6489();
            this.method6560(var2, var2);
        }
    }

    @ObfuscatedName("nz.al(I)Z")
    public boolean method6435() {
        if (this.method6479()) {
            int var1 = this.field3833.method7887(this.field3838, this.field3837);
            this.method6489();
            this.method6560(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nz.aa(S)V")
    public void method6436() {
        this.method6560(0, this.field3833.method7780());
    }

    @ObfuscatedName("nz.ah(III)Z")
    public boolean method6560(int arg0, int arg1) {
        if (!this.method6468()) {
            this.field3838 = arg0;
            this.field3837 = arg1;
            return false;
        }
        if (arg0 > this.field3833.method7780()) {
            arg0 = this.field3833.method7780();
        }
        if (arg1 > this.field3833.method7780()) {
            arg1 = this.field3833.method7780();
        }
        boolean var3 = this.field3838 != arg0 || this.field3837 != arg1;
        this.field3838 = arg0;
        if (this.field3837 != arg1) {
            this.field3837 = arg1;
            this.field3845 = 0;
            this.method6495();
        }
        if (var3 && this.field3855 != null) {
            this.field3855.method2940();
        }
        return var3;
    }

    @ObfuscatedName("nz.bh(ZI)V")
    public void method6438(boolean arg0) {
        class528 var2 = this.method6483(this.field3837);
        this.method6485((Integer) var2.field5317, arg0);
    }

    @ObfuscatedName("nz.bj(ZB)V")
    public void method6423(boolean arg0) {
        class528 var2 = this.method6483(this.field3837);
        this.method6485((Integer) var2.field5318, arg0);
    }

    @ObfuscatedName("nz.bv(ZI)V")
    public void method6411(boolean arg0) {
        this.method6485(0, arg0);
    }

    @ObfuscatedName("nz.bx(ZI)V")
    public void method6627(boolean arg0) {
        this.method6485(this.field3833.method7780(), arg0);
    }

    @ObfuscatedName("nz.bk(ZI)V")
    public void method6442(boolean arg0) {
        if (this.method6479() && !arg0) {
            this.method6485(Math.min(this.field3838, this.field3837), arg0);
        } else if (this.field3837 > 0) {
            this.method6485(this.field3837 - 1, arg0);
        }
    }

    @ObfuscatedName("nz.bb(ZI)V")
    public void method6486(boolean arg0) {
        if (this.method6479() && !arg0) {
            this.method6485(Math.max(this.field3838, this.field3837), arg0);
        } else if (this.field3837 < this.field3833.method7780()) {
            this.method6485(this.field3837 + 1, arg0);
        }
    }

    @ObfuscatedName("nz.bq(ZI)V")
    public void method6444(boolean arg0) {
        if (this.field3837 > 0) {
            class528 var2 = this.method6623(this.field3837 - 1);
            this.method6485((Integer) var2.field5317, arg0);
        }
    }

    @ObfuscatedName("nz.bp(ZI)V")
    public void method6445(boolean arg0) {
        if (this.field3837 < this.field3833.method7780()) {
            class528 var2 = this.method6623(this.field3837 + 1);
            this.method6485((Integer) var2.field5318, arg0);
        }
    }

    @ObfuscatedName("nz.bz(ZI)V")
    public void method6446(boolean arg0) {
        if (this.field3837 > 0) {
            this.method6485(this.field3833.method7798(this.field3837, -1), arg0);
        }
    }

    @ObfuscatedName("nz.bc(ZB)V")
    public void method6531(boolean arg0) {
        if (this.field3837 < this.field3833.method7780()) {
            this.method6485(this.field3833.method7798(this.field3837, 1), arg0);
        }
    }

    @ObfuscatedName("nz.by(ZB)V")
    public void method6554(boolean arg0) {
        if (this.field3837 > 0) {
            int var2 = this.method6641();
            this.method6485(this.field3833.method7798(this.field3837, -var2), arg0);
        }
    }

    @ObfuscatedName("nz.br(ZS)V")
    public void method6449(boolean arg0) {
        if (this.field3837 < this.field3833.method7780()) {
            int var2 = this.method6641();
            this.method6485(this.field3833.method7798(this.field3837, var2), arg0);
        }
    }

    @ObfuscatedName("nz.bn(ZB)V")
    public void method6450(boolean arg0) {
        class441 var2 = this.field3833.method7789(0, this.field3837);
        class528 var3 = var2.method8026();
        this.method6485(this.field3833.method7797((Integer) var3.field5317, this.field3859), arg0);
    }

    @ObfuscatedName("nz.bu(ZI)V")
    public void method6451(boolean arg0) {
        class441 var2 = this.field3833.method7789(0, this.field3837);
        class528 var3 = var2.method8026();
        this.method6485(this.field3833.method7797((Integer) var3.field5317, this.field3859 + this.field3857), arg0);
    }

    @ObfuscatedName("nz.bt(IIZZI)V")
    public void method6487(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3841) {
            int var7 = this.field3858 + arg0;
            int var8 = this.field3859 + arg1;
            class528 var9 = this.method6491();
            var6 = this.field3833.method7797(var7 - (Integer) var9.field5317, var8 - (Integer) var9.field5318);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3848 = 1;
            class528 var10 = this.method6623(var6);
            class528 var11 = this.method6623(this.field3852);
            this.method6452(var11, var10);
        } else if (arg2) {
            this.field3848 = 1;
            class528 var12 = this.method6623(var6);
            this.method6560((Integer) var12.field5317, (Integer) var12.field5318);
            this.field3852 = (Integer) var12.field5317;
        } else if (arg3) {
            this.method6560(this.field3852, var6);
        } else {
            if (this.field3853 <= 0 || this.field3852 != var6) {
                this.field3848 = 0;
                this.method6560(var6, var6);
                this.field3852 = var6;
            } else if (this.field3838 == this.field3837) {
                this.field3848 = 1;
                class528 var13 = this.method6623(var6);
                this.method6560((Integer) var13.field5317, (Integer) var13.field5318);
            } else {
                this.field3848 = 2;
                class528 var14 = this.method6483(var6);
                this.method6560((Integer) var14.field5317, (Integer) var14.field5318);
            }
            this.field3853 = 25;
        }
    }

    @ObfuscatedName("nz.bs(IIB)V")
    public void method6453(int arg0, int arg1) {
        if (!this.field3841 || !this.method6463()) {
            return;
        }
        int var3 = this.field3858 + arg0;
        int var4 = this.field3859 + arg1;
        class528 var5 = this.method6491();
        int var6 = this.field3833.method7797(var3 - (Integer) var5.field5317, var4 - (Integer) var5.field5318);
        switch(this.field3848) {
            case 0:
                this.method6560(this.field3838, var6);
                break;
            case 1:
                class528 var9 = this.method6623(this.field3852);
                class528 var10 = this.method6623(var6);
                this.method6452(var9, var10);
                break;
            case 2:
                class528 var7 = this.method6483(this.field3852);
                class528 var8 = this.method6483(var6);
                this.method6452(var7, var8);
        }
    }

    @ObfuscatedName("nz.bm(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6559(Clipboard arg0) {
        class441 var2 = this.field3833.method7789(this.field3838, this.field3837);
        if (!var2.method8038()) {
            String var3 = var2.method8025();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("nz.bo(Ljava/awt/datatransfer/Clipboard;S)V")
    public void method6454(Clipboard arg0) {
        if (this.method6479()) {
            this.method6559(arg0);
            this.method6435();
        }
    }

    @ObfuscatedName("nz.bd(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method6455(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method6422((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method6435();
            class438 var4 = this.field3833.method7842(var3, this.field3837, this.field3854);
            this.method6560(var4.method7917(), var4.method7917());
            this.method6441();
            this.method6489();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("nz.ba(I)V")
    public void method6456() {
        this.field3859 = Math.max(0, this.field3859 - this.field3833.method7801());
    }

    @ObfuscatedName("nz.bw(I)V")
    public void method6626() {
        int var1 = Math.max(0, this.field3833.method7796() - this.field3857);
        this.field3859 = Math.min(var1, this.field3859 + this.field3833.method7801());
    }

    @ObfuscatedName("nz.bi(Lnj;I)V")
    public void method6458(class352 arg0) {
        this.field3860 = arg0;
    }

    @ObfuscatedName("nz.bf(Lnj;S)V")
    public void method6470(class352 arg0) {
        this.field3855 = arg0;
    }

    @ObfuscatedName("nz.bg(I)Lql;")
    public class437 method6460() {
        return this.field3833;
    }

    @ObfuscatedName("nz.bl(I)Lql;")
    public class437 method6514() {
        return this.field3842;
    }

    @ObfuscatedName("nz.be(I)Lqb;")
    public class441 method6457() {
        return this.field3833.method7789(this.field3838, this.field3837);
    }

    @ObfuscatedName("nz.cq(B)Z")
    public boolean method6463() {
        return this.field3843;
    }

    @ObfuscatedName("nz.cb(I)Z")
    public boolean method6464() {
        return this.field3844;
    }

    @ObfuscatedName("nz.cd(B)Z")
    public boolean method6465() {
        return this.method6463() && this.field3845 % 60 < 30;
    }

    @ObfuscatedName("nz.ci(I)I")
    public int method6466() {
        return this.field3837;
    }

    @ObfuscatedName("nz.cn(B)I")
    public int method6467() {
        return this.field3838;
    }

    @ObfuscatedName("nz.co(I)Z")
    public boolean method6468() {
        return this.field3841;
    }

    @ObfuscatedName("nz.cf(B)I")
    public int method6469() {
        return this.field3858;
    }

    @ObfuscatedName("nz.cl(B)I")
    public int method6571() {
        return this.field3859;
    }

    @ObfuscatedName("nz.cp(B)I")
    public int method6472() {
        return this.field3833.method7804();
    }

    @ObfuscatedName("nz.cv(I)I")
    public int method6570() {
        return this.field3833.method7836();
    }

    @ObfuscatedName("nz.cy(S)I")
    public int method6473() {
        return this.field3850;
    }

    @ObfuscatedName("nz.cu(B)I")
    public int method6474() {
        return this.field3847;
    }

    @ObfuscatedName("nz.ce(I)I")
    public int method6475() {
        return this.field3833.method7806();
    }

    @ObfuscatedName("nz.cg(I)I")
    public int method6480() {
        return this.field3846;
    }

    @ObfuscatedName("nz.cx(I)I")
    public int method6573() {
        return this.field3833.method7881();
    }

    @ObfuscatedName("nz.cz(I)Z")
    public boolean method6478() {
        return this.method6570() > 1;
    }

    @ObfuscatedName("nz.ch(I)Z")
    public boolean method6479() {
        return this.field3838 != this.field3837;
    }

    @ObfuscatedName("nz.ct(Ljava/lang/String;S)Ljava/lang/String;")
    public String method6422(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method6490(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("nz.cc(Luy;Luy;B)V")
    public void method6452(class528 arg0, class528 arg1) {
        if ((Integer) arg1.field5317 < (Integer) arg0.field5317) {
            this.method6560((Integer) arg0.field5318, (Integer) arg1.field5317);
        } else {
            this.method6560((Integer) arg0.field5317, (Integer) arg1.field5318);
        }
    }

    @ObfuscatedName("nz.cj(II)Luy;")
    public class528 method6623(int arg0) {
        int var2 = this.field3833.method7780();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method6488(this.field3833.method7810(var5 - 1).field4840)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method6488(this.field3833.method7810(var6).field4840)) {
                var4 = var6;
                break;
            }
        }
        return new class528(var3, var4);
    }

    @ObfuscatedName("nz.cm(II)Luy;")
    public class528 method6483(int arg0) {
        int var2 = this.field3833.method7780();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3833.method7810(var5 - 1).field4840 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3833.method7810(var6).field4840 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class528(var3, var4);
    }

    @ObfuscatedName("nz.cw(I)Z")
    public boolean method6441() {
        if (!this.method6468()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3833.method7780() > this.field3850) {
            this.field3833.method7887(this.field3850, this.field3833.method7780());
            var1 = true;
        }
        int var2 = this.method6570();
        if (this.field3833.method7802() > var2) {
            int var3 = this.field3833.method7798(0, var2) - 1;
            this.field3833.method7887(var3, this.field3833.method7780());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3837;
            int var5 = this.field3838;
            int var6 = this.field3833.method7780();
            if (this.field3837 > var6) {
                var4 = var6;
            }
            if (this.field3838 > var6) {
                var5 = var6;
            }
            this.method6560(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("nz.ca(IZI)V")
    public void method6485(int arg0, boolean arg1) {
        if (arg1) {
            this.method6560(this.field3838, arg0);
        } else {
            this.method6560(arg0, arg0);
        }
    }

    @ObfuscatedName("nz.cs(B)I")
    public int method6641() {
        return this.field3857 / this.field3833.method7801();
    }

    @ObfuscatedName("nz.cr(I)V")
    public void method6495() {
        class441 var1 = this.field3833.method7789(0, this.field3837);
        class528 var2 = var1.method8026();
        int var3 = this.field3833.method7801();
        int var4 = (Integer) var2.field5317 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5318 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3858;
        int var9 = this.field3862 + var8;
        int var10 = this.field3859;
        int var11 = this.field3857 + var10;
        int var12 = this.field3858;
        int var13 = this.field3859;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3862;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3857;
        }
        this.method6655(var12, var13);
    }

    @ObfuscatedName("nz.ck(II)Z")
    public boolean method6488(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("nz.dq(I)V")
    public void method6489() {
        if (this.field3860 != null) {
            this.field3860.method2940();
        }
    }

    @ObfuscatedName("nz.dd(II)Z")
    public boolean method6490(int arg0) {
        switch(this.field3846) {
            case 1:
                return class420.method7155((char) arg0);
            case 2:
                return class420.method5751((char) arg0);
            case 3:
                return Statics.method3817((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (Statics.method3817(var2)) {
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

    @ObfuscatedName("nz.dc(B)Luy;")
    public class528 method6491() {
        int var1 = this.field3833.method7808(this.field3862);
        int var2 = this.field3833.method7809(this.field3857);
        return new class528(var1, var2);
    }
}
