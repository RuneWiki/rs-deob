package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("np")
public class class356 {

    @ObfuscatedName("np.au")
    public class432 field3777 = new class432();

    @ObfuscatedName("np.as")
    public class432 field3778 = new class432();

    @ObfuscatedName("np.aw")
    public boolean field3789 = false;

    @ObfuscatedName("np.ad")
    public boolean field3780 = true;

    @ObfuscatedName("np.ai")
    public int field3781 = 0;

    @ObfuscatedName("np.an")
    public boolean field3791 = false;

    @ObfuscatedName("np.am")
    public int field3784 = 0;

    @ObfuscatedName("np.ar")
    public int field3779 = 0;

    @ObfuscatedName("np.ag")
    public int field3785 = 0;

    @ObfuscatedName("np.bs")
    public int field3786 = 0;

    @ObfuscatedName("np.bf")
    public int field3787 = 0;

    @ObfuscatedName("np.bo")
    public int field3771 = 0;

    @ObfuscatedName("np.bi")
    public int field3794 = 0;

    @ObfuscatedName("np.bt")
    public int field3790 = Integer.MAX_VALUE;

    @ObfuscatedName("np.bn")
    public int field3788 = Integer.MAX_VALUE;

    @ObfuscatedName("np.bw")
    public int field3792 = 0;

    @ObfuscatedName("np.bl")
    public int field3772 = 0;

    @ObfuscatedName("np.be")
    public int field3793 = 0;

    @ObfuscatedName("np.bg")
    public int field3795 = 0;

    @ObfuscatedName("np.bu")
    public class348 field3796;

    @ObfuscatedName("np.bh")
    public class348 field3797;

    public class356() {
        this.field3777.method7331(1);
        this.field3778.method7331(1);
    }

    @ObfuscatedName("np.ak(I)V")
    public void method5986() {
        this.field3781 = (this.field3781 + 1) % 60;
        if (this.field3794 > 0) {
            this.field3794--;
        }
    }

    @ObfuscatedName("np.al(ZI)Z")
    public boolean method5987(boolean arg0) {
        boolean var2 = arg0 && this.field3780;
        boolean var3 = this.field3789 != var2;
        this.field3789 = var2;
        if (!this.field3789) {
            this.method6257(this.field3786, this.field3786);
        }
        return var3;
    }

    @ObfuscatedName("np.aj(ZI)V")
    public void method6110(boolean arg0) {
        this.field3780 = arg0;
        this.field3789 = arg0 && this.field3789;
    }

    @ObfuscatedName("np.az(Ljava/lang/String;I)Z")
    public boolean method5989(String arg0) {
        String var2 = this.field3777.method7326();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method6011(arg0);
        this.field3777.method7370(var3);
        this.method6257(this.field3787, this.field3786);
        this.method6219(this.field3793, this.field3795);
        this.method6059();
        this.method6090();
        return true;
    }

    @ObfuscatedName("np.af(Ljava/lang/String;B)Z")
    public boolean method5990(String arg0) {
        this.field3778.method7370(arg0);
        return true;
    }

    @ObfuscatedName("np.aa(Lqt;I)Z")
    public boolean method5991(class435 arg0) {
        boolean var2 = !this.field3791;
        this.field3777.method7330(arg0);
        this.field3778.method7330(arg0);
        this.field3791 = true;
        boolean var3 = var2 | this.method6219(this.field3793, this.field3795);
        boolean var4 = var3 | this.method6257(this.field3787, this.field3786);
        if (this.method6059()) {
            this.method6090();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("np.at(III)Z")
    public boolean method5992(int arg0, int arg1) {
        boolean var3 = this.field3792 != arg0 || this.field3772 != arg1;
        this.field3792 = arg0;
        this.field3772 = arg1;
        return var3 | this.method6219(this.field3793, this.field3795);
    }

    @ObfuscatedName("np.ab(II)Z")
    public boolean method5993(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3777.method7349();
        this.field3777.method7327(arg0);
        this.field3778.method7327(arg0);
        if (this.method6059()) {
            this.method6090();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("np.ac(II)Z")
    public boolean method6191(int arg0) {
        this.field3777.method7328(arg0);
        if (this.method6059()) {
            this.method6090();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("np.ao(II)Z")
    public boolean method5995(int arg0) {
        this.field3788 = arg0;
        if (this.method6059()) {
            this.method6090();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("np.ah(IIB)Z")
    public boolean method6219(int arg0, int arg1) {
        if (!this.method6043()) {
            this.field3793 = arg0;
            this.field3795 = arg1;
            return false;
        }
        int var3 = this.field3793;
        int var4 = this.field3795;
        int var5 = Math.max(0, this.field3777.method7344() - this.field3792 + 2);
        int var6 = Math.max(0, this.field3777.method7401() - this.field3772 + 1);
        this.field3793 = Math.max(0, Math.min(var5, arg0));
        this.field3795 = Math.max(0, Math.min(var6, arg1));
        return this.field3793 != var3 || this.field3795 != var4;
    }

    @ObfuscatedName("np.av(III)Z")
    public boolean method5997(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3777.method7332(arg0, arg1) : false;
    }

    @ObfuscatedName("np.aq(II)V")
    public void method5998(int arg0) {
        this.field3777.method7371(arg0);
    }

    @ObfuscatedName("np.ap(II)V")
    public void method5999(int arg0) {
        this.field3784 = arg0;
    }

    @ObfuscatedName("np.ae(II)V")
    public void method6000(int arg0) {
        this.field3777.method7331(arg0);
    }

    @ObfuscatedName("np.ax(IB)V")
    public void method6001(int arg0) {
        this.field3777.method7329(arg0);
    }

    @ObfuscatedName("np.ay(IB)Z")
    public boolean method6002(int arg0) {
        this.field3785 = arg0;
        String var2 = this.field3777.method7326();
        int var3 = var2.length();
        String var4 = this.method6011(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3777.method7370(var4);
        this.method6219(this.field3793, this.field3795);
        this.method6059();
        this.method6090();
        return true;
    }

    @ObfuscatedName("np.au(B)V")
    public void method6132() {
        this.field3791 = false;
    }

    @ObfuscatedName("np.as(IB)Z")
    public boolean method6004(int arg0) {
        if (this.method6065(arg0)) {
            this.method6232();
            class433 var2 = this.field3777.method7421((char) arg0, this.field3786, this.field3790);
            this.method6257(var2.method7452(), var2.method7452());
            this.method6059();
            this.method6090();
        }
        return true;
    }

    @ObfuscatedName("np.aw(I)V")
    public void method6005() {
        if (!this.method6232() && this.field3786 > 0) {
            int var1 = this.field3777.method7391(this.field3786 - 1);
            this.method6090();
            this.method6257(var1, var1);
        }
    }

    @ObfuscatedName("np.ad(I)V")
    public void method6006() {
        if (!this.method6232() && this.field3786 < this.field3777.method7376()) {
            int var1 = this.field3777.method7391(this.field3786);
            this.method6090();
            this.method6257(var1, var1);
        }
    }

    @ObfuscatedName("np.ai(I)V")
    public void method6144() {
        if (!this.method6232() && this.field3786 > 0) {
            class517 var1 = this.method6027(this.field3786 - 1);
            int var2 = this.field3777.method7341((Integer) var1.field5200, this.field3786);
            this.method6090();
            this.method6257(var2, var2);
        }
    }

    @ObfuscatedName("np.an(B)V")
    public void method6068() {
        if (!this.method6232() && this.field3786 < this.field3777.method7376()) {
            class517 var1 = this.method6027(this.field3786);
            int var2 = this.field3777.method7341(this.field3786, (Integer) var1.field5199);
            this.method6090();
            this.method6257(var2, var2);
        }
    }

    @ObfuscatedName("np.am(I)Z")
    public boolean method6232() {
        if (this.method6013()) {
            int var1 = this.field3777.method7341(this.field3787, this.field3786);
            this.method6090();
            this.method6257(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("np.ar(I)V")
    public void method6166() {
        this.method6257(0, this.field3777.method7376());
    }

    @ObfuscatedName("np.ag(III)Z")
    public boolean method6257(int arg0, int arg1) {
        if (!this.method6043()) {
            this.field3787 = arg0;
            this.field3786 = arg1;
            return false;
        }
        if (arg0 > this.field3777.method7376()) {
            arg0 = this.field3777.method7376();
        }
        if (arg1 > this.field3777.method7376()) {
            arg1 = this.field3777.method7376();
        }
        boolean var3 = this.field3787 != arg0 || this.field3786 != arg1;
        this.field3787 = arg0;
        if (this.field3786 != arg1) {
            this.field3786 = arg1;
            this.field3781 = 0;
            this.method6062();
        }
        if (var3 && this.field3797 != null) {
            this.field3797.method2636();
        }
        return var3;
    }

    @ObfuscatedName("np.bs(ZI)V")
    public void method6074(boolean arg0) {
        class517 var2 = this.method6119(this.field3786);
        this.method5996((Integer) var2.field5200, arg0);
    }

    @ObfuscatedName("np.bf(ZB)V")
    public void method6052(boolean arg0) {
        class517 var2 = this.method6119(this.field3786);
        this.method5996((Integer) var2.field5199, arg0);
    }

    @ObfuscatedName("np.bo(ZI)V")
    public void method6014(boolean arg0) {
        this.method5996(0, arg0);
    }

    @ObfuscatedName("np.bi(ZI)V")
    public void method6015(boolean arg0) {
        this.method5996(this.field3777.method7376(), arg0);
    }

    @ObfuscatedName("np.bt(ZI)V")
    public void method6016(boolean arg0) {
        if (this.method6013() && !arg0) {
            this.method5996(Math.min(this.field3787, this.field3786), arg0);
        } else if (this.field3786 > 0) {
            this.method5996(this.field3786 - 1, arg0);
        }
    }

    @ObfuscatedName("np.bn(ZI)V")
    public void method5994(boolean arg0) {
        if (this.method6013() && !arg0) {
            this.method5996(Math.max(this.field3787, this.field3786), arg0);
        } else if (this.field3786 < this.field3777.method7376()) {
            this.method5996(this.field3786 + 1, arg0);
        }
    }

    @ObfuscatedName("np.bw(ZI)V")
    public void method6018(boolean arg0) {
        if (this.field3786 > 0) {
            class517 var2 = this.method6027(this.field3786 - 1);
            this.method5996((Integer) var2.field5200, arg0);
        }
    }

    @ObfuscatedName("np.bl(ZI)V")
    public void method6019(boolean arg0) {
        if (this.field3786 < this.field3777.method7376()) {
            class517 var2 = this.method6027(this.field3786 + 1);
            this.method5996((Integer) var2.field5199, arg0);
        }
    }

    @ObfuscatedName("np.be(ZB)V")
    public void method6180(boolean arg0) {
        if (this.field3786 > 0) {
            this.method5996(this.field3777.method7343(this.field3786, -1), arg0);
        }
    }

    @ObfuscatedName("np.bg(ZI)V")
    public void method6021(boolean arg0) {
        if (this.field3786 < this.field3777.method7376()) {
            this.method5996(this.field3777.method7343(this.field3786, 1), arg0);
        }
    }

    @ObfuscatedName("np.bu(ZB)V")
    public void method6022(boolean arg0) {
        if (this.field3786 > 0) {
            int var2 = this.method6209();
            this.method5996(this.field3777.method7343(this.field3786, -var2), arg0);
        }
    }

    @ObfuscatedName("np.bh(ZB)V")
    public void method6023(boolean arg0) {
        if (this.field3786 < this.field3777.method7376()) {
            int var2 = this.method6209();
            this.method5996(this.field3777.method7343(this.field3786, var2), arg0);
        }
    }

    @ObfuscatedName("np.bk(ZI)V")
    public void method6201(boolean arg0) {
        class436 var2 = this.field3777.method7334(0, this.field3786);
        class517 var3 = var2.method7566();
        this.method5996(this.field3777.method7342((Integer) var3.field5200, this.field3795), arg0);
    }

    @ObfuscatedName("np.bp(ZI)V")
    public void method6025(boolean arg0) {
        class436 var2 = this.field3777.method7334(0, this.field3786);
        class517 var3 = var2.method7566();
        this.method5996(this.field3777.method7342((Integer) var3.field5200, this.field3795 + this.field3772), arg0);
    }

    @ObfuscatedName("np.br(IIZZB)V")
    public void method6038(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3791) {
            int var7 = this.field3793 + arg0;
            int var8 = this.field3795 + arg1;
            class517 var9 = this.method6195();
            var6 = this.field3777.method7342(var7 - (Integer) var9.field5200, var8 - (Integer) var9.field5199);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3779 = 1;
            class517 var10 = this.method6027(var6);
            class517 var11 = this.method6027(this.field3771);
            this.method6227(var11, var10);
        } else if (arg2) {
            this.field3779 = 1;
            class517 var12 = this.method6027(var6);
            this.method6257((Integer) var12.field5200, (Integer) var12.field5199);
            this.field3771 = (Integer) var12.field5200;
        } else if (arg3) {
            this.method6257(this.field3771, var6);
        } else {
            if (this.field3794 <= 0 || this.field3771 != var6) {
                this.field3779 = 0;
                this.method6257(var6, var6);
                this.field3771 = var6;
            } else if (this.field3787 == this.field3786) {
                this.field3779 = 1;
                class517 var13 = this.method6027(var6);
                this.method6257((Integer) var13.field5200, (Integer) var13.field5199);
            } else {
                this.field3779 = 2;
                class517 var14 = this.method6119(var6);
                this.method6257((Integer) var14.field5200, (Integer) var14.field5199);
            }
            this.field3794 = 25;
        }
    }

    @ObfuscatedName("np.bx(IIB)V")
    public void method6073(int arg0, int arg1) {
        if (!this.field3791 || !this.method6163()) {
            return;
        }
        int var3 = this.field3793 + arg0;
        int var4 = this.field3795 + arg1;
        class517 var5 = this.method6195();
        int var6 = this.field3777.method7342(var3 - (Integer) var5.field5200, var4 - (Integer) var5.field5199);
        switch(this.field3779) {
            case 0:
                this.method6257(this.field3787, var6);
                break;
            case 1:
                class517 var9 = this.method6027(this.field3771);
                class517 var10 = this.method6027(var6);
                this.method6227(var9, var10);
                break;
            case 2:
                class517 var7 = this.method6119(this.field3771);
                class517 var8 = this.method6119(var6);
                this.method6227(var7, var8);
        }
    }

    @ObfuscatedName("np.bd(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method6028(Clipboard arg0) {
        class436 var2 = this.field3777.method7334(this.field3787, this.field3786);
        if (!var2.method7562()) {
            String var3 = var2.method7574();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("np.bv(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method6054(Clipboard arg0) {
        if (this.method6013()) {
            this.method6028(arg0);
            this.method6232();
        }
    }

    @ObfuscatedName("np.bm(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6030(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method6011((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method6232();
            class433 var4 = this.field3777.method7336(var3, this.field3786, this.field3790);
            this.method6257(var4.method7452(), var4.method7452());
            this.method6059();
            this.method6090();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("np.bq(B)V")
    public void method6031() {
        this.field3795 = Math.max(0, this.field3795 - this.field3777.method7346());
    }

    @ObfuscatedName("np.bj(I)V")
    public void method6032() {
        int var1 = Math.max(0, this.field3777.method7401() - this.field3772);
        this.field3795 = Math.min(var1, this.field3795 + this.field3777.method7346());
    }

    @ObfuscatedName("np.bc(Lnl;I)V")
    public void method6033(class348 arg0) {
        this.field3796 = arg0;
    }

    @ObfuscatedName("np.bz(Lnl;B)V")
    public void method6034(class348 arg0) {
        this.field3797 = arg0;
    }

    @ObfuscatedName("np.ba(B)Lqw;")
    public class432 method6035() {
        return this.field3777;
    }

    @ObfuscatedName("np.bb(I)Lqw;")
    public class432 method6036() {
        return this.field3778;
    }

    @ObfuscatedName("np.by(B)Lqv;")
    public class436 method6037() {
        return this.field3777.method7334(this.field3787, this.field3786);
    }

    @ObfuscatedName("np.cw(I)Z")
    public boolean method6163() {
        return this.field3789;
    }

    @ObfuscatedName("np.ck(B)Z")
    public boolean method6101() {
        return this.field3780;
    }

    @ObfuscatedName("np.cn(S)Z")
    public boolean method6040() {
        return this.method6163() && this.field3781 % 60 < 30;
    }

    @ObfuscatedName("np.ch(I)I")
    public int method6041() {
        return this.field3786;
    }

    @ObfuscatedName("np.cp(B)I")
    public int method6192() {
        return this.field3787;
    }

    @ObfuscatedName("np.cd(I)Z")
    public boolean method6043() {
        return this.field3791;
    }

    @ObfuscatedName("np.cs(I)I")
    public int method6042() {
        return this.field3793;
    }

    @ObfuscatedName("np.cm(I)I")
    public int method6067() {
        return this.field3795;
    }

    @ObfuscatedName("np.ci(S)I")
    public int method6046() {
        return this.field3777.method7349();
    }

    @ObfuscatedName("np.cc(B)I")
    public int method6047() {
        return this.field3777.method7350();
    }

    @ObfuscatedName("np.cb(B)I")
    public int method6048() {
        return this.field3788;
    }

    @ObfuscatedName("np.cr(I)I")
    public int method6049() {
        return this.field3784;
    }

    @ObfuscatedName("np.co(I)I")
    public int method6050() {
        return this.field3777.method7333();
    }

    @ObfuscatedName("np.cf(I)I")
    public int method6051() {
        return this.field3785;
    }

    @ObfuscatedName("np.ce(I)I")
    public int method6168() {
        return this.field3777.method7352();
    }

    @ObfuscatedName("np.cz(S)Z")
    public boolean method6053() {
        return this.method6047() > 1;
    }

    @ObfuscatedName("np.ca(I)Z")
    public boolean method6013() {
        return this.field3787 != this.field3786;
    }

    @ObfuscatedName("np.cl(Ljava/lang/String;I)Ljava/lang/String;")
    public String method6011(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method6065(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("np.cq(Lto;Lto;I)V")
    public void method6227(class517 arg0, class517 arg1) {
        if ((Integer) arg1.field5200 < (Integer) arg0.field5200) {
            this.method6257((Integer) arg0.field5199, (Integer) arg1.field5200);
        } else {
            this.method6257((Integer) arg0.field5200, (Integer) arg1.field5199);
        }
    }

    @ObfuscatedName("np.cy(IB)Lto;")
    public class517 method6027(int arg0) {
        int var2 = this.field3777.method7376();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method6223(this.field3777.method7321(var5 - 1).field4750)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method6223(this.field3777.method7321(var6).field4750)) {
                var4 = var6;
                break;
            }
        }
        return new class517(var3, var4);
    }

    @ObfuscatedName("np.ct(II)Lto;")
    public class517 method6119(int arg0) {
        int var2 = this.field3777.method7376();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3777.method7321(var5 - 1).field4750 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3777.method7321(var6).field4750 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class517(var3, var4);
    }

    @ObfuscatedName("np.cg(I)Z")
    public boolean method6059() {
        if (!this.method6043()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3777.method7376() > this.field3788) {
            this.field3777.method7341(this.field3788, this.field3777.method7376());
            var1 = true;
        }
        int var2 = this.method6047();
        if (this.field3777.method7361() > var2) {
            int var3 = this.field3777.method7343(0, var2) - 1;
            this.field3777.method7341(var3, this.field3777.method7376());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3786;
            int var5 = this.field3787;
            int var6 = this.field3777.method7376();
            if (this.field3786 > var6) {
                var4 = var6;
            }
            if (this.field3787 > var6) {
                var5 = var6;
            }
            this.method6257(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("np.cv(IZB)V")
    public void method5996(int arg0, boolean arg1) {
        if (arg1) {
            this.method6257(this.field3787, arg0);
        } else {
            this.method6257(arg0, arg0);
        }
    }

    @ObfuscatedName("np.cj(B)I")
    public int method6209() {
        return this.field3772 / this.field3777.method7346();
    }

    @ObfuscatedName("np.cu(I)V")
    public void method6062() {
        class436 var1 = this.field3777.method7334(0, this.field3786);
        class517 var2 = var1.method7566();
        int var3 = this.field3777.method7346();
        int var4 = (Integer) var2.field5200 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5199 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3793;
        int var9 = this.field3792 + var8;
        int var10 = this.field3795;
        int var11 = this.field3772 + var10;
        int var12 = this.field3793;
        int var13 = this.field3795;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3792;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3772;
        }
        this.method6219(var12, var13);
    }

    @ObfuscatedName("np.cx(IB)Z")
    public boolean method6223(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("np.dj(I)V")
    public void method6090() {
        if (this.field3796 != null) {
            this.field3796.method2636();
        }
    }

    @ObfuscatedName("np.dq(II)Z")
    public boolean method6065(int arg0) {
        switch(this.field3785) {
            case 1:
                return class415.method2235((char) arg0);
            case 2:
                return Statics.method5597((char) arg0);
            case 3:
                return class415.method37((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class415.method37(var2)) {
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

    @ObfuscatedName("np.dm(B)Lto;")
    public class517 method6195() {
        int var1 = this.field3777.method7353(this.field3792);
        int var2 = this.field3777.method7354(this.field3772);
        return new class517(var1, var2);
    }
}
