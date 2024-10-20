package deob;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfuscatedName("ns")
public class class359 {

    @ObfuscatedName("ns.ah")
    public class434 field3787 = new class434();

    @ObfuscatedName("ns.ag")
    public class434 field3767 = new class434();

    @ObfuscatedName("ns.av")
    public boolean field3768 = false;

    @ObfuscatedName("ns.ar")
    public boolean field3769 = true;

    @ObfuscatedName("ns.ap")
    public int field3770 = 0;

    @ObfuscatedName("ns.ak")
    public boolean field3771 = false;

    @ObfuscatedName("ns.ai")
    public int field3772 = 0;

    @ObfuscatedName("ns.at")
    public int field3773 = 0;

    @ObfuscatedName("ns.az")
    public int field3774 = 0;

    @ObfuscatedName("ns.bg")
    public int field3775 = 0;

    @ObfuscatedName("ns.bz")
    public int field3776 = 0;

    @ObfuscatedName("ns.bj")
    public int field3777 = 0;

    @ObfuscatedName("ns.bc")
    public int field3784 = 0;

    @ObfuscatedName("ns.bo")
    public int field3761 = Integer.MAX_VALUE;

    @ObfuscatedName("ns.bm")
    public int field3780 = Integer.MAX_VALUE;

    @ObfuscatedName("ns.bd")
    public int field3781 = 0;

    @ObfuscatedName("ns.bh")
    public int field3778 = 0;

    @ObfuscatedName("ns.bx")
    public int field3783 = 0;

    @ObfuscatedName("ns.bv")
    public int field3759 = 0;

    @ObfuscatedName("ns.bu")
    public class351 field3785;

    @ObfuscatedName("ns.bp")
    public class351 field3786;

    public class359() {
        this.field3787.method7399(1);
        this.field3767.method7399(1);
    }

    @ObfuscatedName("ns.ab(I)V")
    public void method6059() {
        this.field3770 = (this.field3770 + 1) % 60;
        if (this.field3784 > 0) {
            this.field3784--;
        }
    }

    @ObfuscatedName("ns.ay(ZI)Z")
    public boolean method6060(boolean arg0) {
        boolean var2 = arg0 && this.field3769;
        boolean var3 = this.field3768 != var2;
        this.field3768 = var2;
        if (!this.field3768) {
            this.method6084(this.field3775, this.field3775);
        }
        return var3;
    }

    @ObfuscatedName("ns.an(ZI)V")
    public void method6072(boolean arg0) {
        this.field3769 = arg0;
        this.field3768 = arg0 && this.field3768;
    }

    @ObfuscatedName("ns.au(Ljava/lang/String;B)Z")
    public boolean method6062(String arg0) {
        String var2 = this.field3787.method7479();
        if (var2.equals(arg0)) {
            return false;
        }
        String var3 = this.method6220(arg0);
        this.field3787.method7406(var3);
        this.method6084(this.field3776, this.field3775);
        this.method6300(this.field3783, this.field3759);
        this.method6281();
        this.method6137();
        return true;
    }

    @ObfuscatedName("ns.ax(Ljava/lang/String;I)Z")
    public boolean method6063(String arg0) {
        this.field3767.method7406(arg0);
        return true;
    }

    @ObfuscatedName("ns.ao(Lqv;I)Z")
    public boolean method6171(class437 arg0) {
        boolean var2 = !this.field3771;
        this.field3787.method7398(arg0);
        this.field3767.method7398(arg0);
        this.field3771 = true;
        boolean var3 = var2 | this.method6300(this.field3783, this.field3759);
        boolean var4 = var3 | this.method6084(this.field3776, this.field3775);
        if (this.method6281()) {
            this.method6137();
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("ns.am(III)Z")
    public boolean method6065(int arg0, int arg1) {
        boolean var3 = this.field3781 != arg0 || this.field3778 != arg1;
        this.field3781 = arg0;
        this.field3778 = arg1;
        return var3 | this.method6300(this.field3783, this.field3759);
    }

    @ObfuscatedName("ns.ac(IB)Z")
    public boolean method6066(int arg0) {
        if (arg0 < 0) {
            arg0 = Integer.MAX_VALUE;
        }
        boolean var2 = arg0 == this.field3787.method7417();
        this.field3787.method7395(arg0);
        this.field3767.method7395(arg0);
        if (this.method6281()) {
            this.method6137();
            var2 = true;
        }
        return var2;
    }

    @ObfuscatedName("ns.ae(IB)Z")
    public boolean method6067(int arg0) {
        this.field3787.method7516(arg0);
        if (this.method6281()) {
            this.method6137();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ns.ad(II)Z")
    public boolean method6068(int arg0) {
        this.field3780 = arg0;
        if (this.method6281()) {
            this.method6137();
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ns.aq(III)Z")
    public boolean method6300(int arg0, int arg1) {
        if (!this.method6263()) {
            this.field3783 = arg0;
            this.field3759 = arg1;
            return false;
        }
        int var3 = this.field3783;
        int var4 = this.field3759;
        int var5 = Math.max(0, this.field3787.method7419() - this.field3781 + 2);
        int var6 = Math.max(0, this.field3787.method7410() - this.field3778 + 1);
        this.field3783 = Math.max(0, Math.min(var5, arg0));
        this.field3759 = Math.max(0, Math.min(var6, arg1));
        return this.field3783 != var3 || this.field3759 != var4;
    }

    @ObfuscatedName("ns.al(IIB)Z")
    public boolean method6070(int arg0, int arg1) {
        boolean var3 = true;
        if (arg0 < 0 || arg0 > 2) {
            var3 = false;
        }
        if (arg1 < 0 || arg1 > 2) {
            var3 = false;
        }
        return var3 ? this.field3787.method7400(arg0, arg1) : false;
    }

    @ObfuscatedName("ns.aj(IB)V")
    public void method6218(int arg0) {
        this.field3787.method7495(arg0);
    }

    @ObfuscatedName("ns.as(IB)V")
    public void method6143(int arg0) {
        this.field3772 = arg0;
    }

    @ObfuscatedName("ns.aw(IB)V")
    public void method6073(int arg0) {
        this.field3787.method7399(arg0);
    }

    @ObfuscatedName("ns.af(II)V")
    public void method6306(int arg0) {
        this.field3787.method7397(arg0);
    }

    @ObfuscatedName("ns.aa(II)Z")
    public boolean method6075(int arg0) {
        this.field3774 = arg0;
        String var2 = this.field3787.method7479();
        int var3 = var2.length();
        String var4 = this.method6220(var2);
        if (var4.length() == var3) {
            return false;
        }
        this.field3787.method7406(var4);
        this.method6300(this.field3783, this.field3759);
        this.method6281();
        this.method6137();
        return true;
    }

    @ObfuscatedName("ns.ah(I)V")
    public void method6076() {
        this.field3771 = false;
    }

    @ObfuscatedName("ns.ag(IB)Z")
    public boolean method6144(int arg0) {
        if (this.method6087(arg0)) {
            this.method6294();
            class435 var2 = this.field3787.method7388((char) arg0, this.field3775, this.field3761);
            this.method6084(var2.method7523(), var2.method7523());
            this.method6281();
            this.method6137();
        }
        return true;
    }

    @ObfuscatedName("ns.av(I)V")
    public void method6207() {
        if (!this.method6294() && this.field3775 > 0) {
            int var1 = this.field3787.method7408(this.field3775 - 1);
            this.method6137();
            this.method6084(var1, var1);
        }
    }

    @ObfuscatedName("ns.ar(B)V")
    public void method6079() {
        if (!this.method6294() && this.field3775 < this.field3787.method7393()) {
            int var1 = this.field3787.method7408(this.field3775);
            this.method6137();
            this.method6084(var1, var1);
        }
    }

    @ObfuscatedName("ns.ap(I)V")
    public void method6080() {
        if (!this.method6294() && this.field3775 > 0) {
            class519 var1 = this.method6130(this.field3775 - 1);
            int var2 = this.field3787.method7429((Integer) var1.field5230, this.field3775);
            this.method6137();
            this.method6084(var2, var2);
        }
    }

    @ObfuscatedName("ns.ak(I)V")
    public void method6081() {
        if (!this.method6294() && this.field3775 < this.field3787.method7393()) {
            class519 var1 = this.method6130(this.field3775);
            int var2 = this.field3787.method7429(this.field3775, (Integer) var1.field5228);
            this.method6137();
            this.method6084(var2, var2);
        }
    }

    @ObfuscatedName("ns.ai(I)Z")
    public boolean method6294() {
        if (this.method6127()) {
            int var1 = this.field3787.method7429(this.field3776, this.field3775);
            this.method6137();
            this.method6084(var1, var1);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ns.at(I)V")
    public void method6083() {
        this.method6084(0, this.field3787.method7393());
    }

    @ObfuscatedName("ns.az(IIB)Z")
    public boolean method6084(int arg0, int arg1) {
        if (!this.method6263()) {
            this.field3776 = arg0;
            this.field3775 = arg1;
            return false;
        }
        if (arg0 > this.field3787.method7393()) {
            arg0 = this.field3787.method7393();
        }
        if (arg1 > this.field3787.method7393()) {
            arg1 = this.field3787.method7393();
        }
        boolean var3 = this.field3776 != arg0 || this.field3775 != arg1;
        this.field3776 = arg0;
        if (this.field3775 != arg1) {
            this.field3775 = arg1;
            this.field3770 = 0;
            this.method6135();
        }
        if (var3 && this.field3786 != null) {
            this.field3786.method2727();
        }
        return var3;
    }

    @ObfuscatedName("ns.bg(ZI)V")
    public void method6085(boolean arg0) {
        class519 var2 = this.method6131(this.field3775);
        this.method6329((Integer) var2.field5230, arg0);
    }

    @ObfuscatedName("ns.bz(ZI)V")
    public void method6086(boolean arg0) {
        class519 var2 = this.method6131(this.field3775);
        this.method6329((Integer) var2.field5228, arg0);
    }

    @ObfuscatedName("ns.bj(ZI)V")
    public void method6095(boolean arg0) {
        this.method6329(0, arg0);
    }

    @ObfuscatedName("ns.bc(ZI)V")
    public void method6088(boolean arg0) {
        this.method6329(this.field3787.method7393(), arg0);
    }

    @ObfuscatedName("ns.bo(ZS)V")
    public void method6309(boolean arg0) {
        if (this.method6127() && !arg0) {
            this.method6329(Math.min(this.field3776, this.field3775), arg0);
        } else if (this.field3775 > 0) {
            this.method6329(this.field3775 - 1, arg0);
        }
    }

    @ObfuscatedName("ns.bm(ZB)V")
    public void method6105(boolean arg0) {
        if (this.method6127() && !arg0) {
            this.method6329(Math.max(this.field3776, this.field3775), arg0);
        } else if (this.field3775 < this.field3787.method7393()) {
            this.method6329(this.field3775 + 1, arg0);
        }
    }

    @ObfuscatedName("ns.bd(ZB)V")
    public void method6166(boolean arg0) {
        if (this.field3775 > 0) {
            class519 var2 = this.method6130(this.field3775 - 1);
            this.method6329((Integer) var2.field5230, arg0);
        }
    }

    @ObfuscatedName("ns.bh(ZB)V")
    public void method6092(boolean arg0) {
        if (this.field3775 < this.field3787.method7393()) {
            class519 var2 = this.method6130(this.field3775 + 1);
            this.method6329((Integer) var2.field5228, arg0);
        }
    }

    @ObfuscatedName("ns.bx(ZB)V")
    public void method6093(boolean arg0) {
        if (this.field3775 > 0) {
            this.method6329(this.field3787.method7411(this.field3775, -1), arg0);
        }
    }

    @ObfuscatedName("ns.bv(ZS)V")
    public void method6094(boolean arg0) {
        if (this.field3775 < this.field3787.method7393()) {
            this.method6329(this.field3787.method7411(this.field3775, 1), arg0);
        }
    }

    @ObfuscatedName("ns.bu(ZI)V")
    public void method6243(boolean arg0) {
        if (this.field3775 > 0) {
            int var2 = this.method6134();
            this.method6329(this.field3787.method7411(this.field3775, -var2), arg0);
        }
    }

    @ObfuscatedName("ns.bp(ZI)V")
    public void method6096(boolean arg0) {
        if (this.field3775 < this.field3787.method7393()) {
            int var2 = this.method6134();
            this.method6329(this.field3787.method7411(this.field3775, var2), arg0);
        }
    }

    @ObfuscatedName("ns.br(ZB)V")
    public void method6064(boolean arg0) {
        class438 var2 = this.field3787.method7471(0, this.field3775);
        class519 var3 = var2.method7635();
        this.method6329(this.field3787.method7437((Integer) var3.field5230, this.field3759), arg0);
    }

    @ObfuscatedName("ns.bf(ZB)V")
    public void method6146(boolean arg0) {
        class438 var2 = this.field3787.method7471(0, this.field3775);
        class519 var3 = var2.method7635();
        this.method6329(this.field3787.method7437((Integer) var3.field5230, this.field3778 + this.field3759), arg0);
    }

    @ObfuscatedName("ns.bq(IIZZI)V")
    public void method6099(int arg0, int arg1, boolean arg2, boolean arg3) {
        boolean var5 = false;
        int var6;
        if (this.field3771) {
            int var7 = this.field3783 + arg0;
            int var8 = this.field3759 + arg1;
            class519 var9 = this.method6139();
            var6 = this.field3787.method7437(var7 - (Integer) var9.field5230, var8 - (Integer) var9.field5228);
        } else {
            var6 = 0;
        }
        if (arg2 && arg3) {
            this.field3773 = 1;
            class519 var10 = this.method6130(var6);
            class519 var11 = this.method6130(this.field3777);
            this.method6129(var11, var10);
        } else if (arg2) {
            this.field3773 = 1;
            class519 var12 = this.method6130(var6);
            this.method6084((Integer) var12.field5230, (Integer) var12.field5228);
            this.field3777 = (Integer) var12.field5230;
        } else if (arg3) {
            this.method6084(this.field3777, var6);
        } else {
            if (this.field3784 <= 0 || this.field3777 != var6) {
                this.field3773 = 0;
                this.method6084(var6, var6);
                this.field3777 = var6;
            } else if (this.field3776 == this.field3775) {
                this.field3773 = 1;
                class519 var13 = this.method6130(var6);
                this.method6084((Integer) var13.field5230, (Integer) var13.field5228);
            } else {
                this.field3773 = 2;
                class519 var14 = this.method6131(var6);
                this.method6084((Integer) var14.field5230, (Integer) var14.field5228);
            }
            this.field3784 = 25;
        }
    }

    @ObfuscatedName("ns.bt(IIB)V")
    public void method6100(int arg0, int arg1) {
        if (!this.field3771 || !this.method6111()) {
            return;
        }
        int var3 = this.field3783 + arg0;
        int var4 = this.field3759 + arg1;
        class519 var5 = this.method6139();
        int var6 = this.field3787.method7437(var3 - (Integer) var5.field5230, var4 - (Integer) var5.field5228);
        switch(this.field3773) {
            case 0:
                this.method6084(this.field3776, var6);
                break;
            case 1:
                class519 var9 = this.method6130(this.field3777);
                class519 var10 = this.method6130(var6);
                this.method6129(var9, var10);
                break;
            case 2:
                class519 var7 = this.method6131(this.field3777);
                class519 var8 = this.method6131(var6);
                this.method6129(var7, var8);
        }
    }

    @ObfuscatedName("ns.bi(Ljava/awt/datatransfer/Clipboard;B)V")
    public void method6209(Clipboard arg0) {
        class438 var2 = this.field3787.method7471(this.field3776, this.field3775);
        if (!var2.method7655()) {
            String var3 = var2.method7633();
            if (!var3.isEmpty()) {
                arg0.setContents(new StringSelection(var3), (ClipboardOwner) null);
            }
        }
    }

    @ObfuscatedName("ns.be(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6102(Clipboard arg0) {
        if (this.method6127()) {
            this.method6209(arg0);
            this.method6294();
        }
    }

    @ObfuscatedName("ns.ba(Ljava/awt/datatransfer/Clipboard;I)V")
    public void method6103(Clipboard arg0) {
        Transferable var2 = arg0.getContents((Object) null);
        if (var2 == null || !var2.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return;
        }
        try {
            String var3 = this.method6220((String) var2.getTransferData(DataFlavor.stringFlavor));
            this.method6294();
            class435 var4 = this.field3787.method7404(var3, this.field3775, this.field3761);
            this.method6084(var4.method7523(), var4.method7523());
            this.method6281();
            this.method6137();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("ns.bn(I)V")
    public void method6162() {
        this.field3759 = Math.max(0, this.field3759 - this.field3787.method7518());
    }

    @ObfuscatedName("ns.bw(I)V")
    public void method6276() {
        int var1 = Math.max(0, this.field3787.method7410() - this.field3778);
        this.field3759 = Math.min(var1, this.field3759 + this.field3787.method7518());
    }

    @ObfuscatedName("ns.bk(Lne;I)V")
    public void method6106(class351 arg0) {
        this.field3785 = arg0;
    }

    @ObfuscatedName("ns.bs(Lne;I)V")
    public void method6107(class351 arg0) {
        this.field3786 = arg0;
    }

    @ObfuscatedName("ns.bb(I)Lqd;")
    public class434 method6132() {
        return this.field3787;
    }

    @ObfuscatedName("ns.by(I)Lqd;")
    public class434 method6244() {
        return this.field3767;
    }

    @ObfuscatedName("ns.bl(I)Lqx;")
    public class438 method6301() {
        return this.field3787.method7471(this.field3776, this.field3775);
    }

    @ObfuscatedName("ns.cx(I)Z")
    public boolean method6111() {
        return this.field3768;
    }

    @ObfuscatedName("ns.cu(B)Z")
    public boolean method6112() {
        return this.field3769;
    }

    @ObfuscatedName("ns.cz(B)Z")
    public boolean method6282() {
        return this.method6111() && this.field3770 % 60 < 30;
    }

    @ObfuscatedName("ns.cm(I)I")
    public int method6114() {
        return this.field3775;
    }

    @ObfuscatedName("ns.ct(I)I")
    public int method6115() {
        return this.field3776;
    }

    @ObfuscatedName("ns.cl(B)Z")
    public boolean method6263() {
        return this.field3771;
    }

    @ObfuscatedName("ns.cb(I)I")
    public int method6117() {
        return this.field3783;
    }

    @ObfuscatedName("ns.cr(I)I")
    public int method6118() {
        return this.field3759;
    }

    @ObfuscatedName("ns.cj(I)I")
    public int method6119() {
        return this.field3787.method7417();
    }

    @ObfuscatedName("ns.cg(I)I")
    public int method6120() {
        return this.field3787.method7458();
    }

    @ObfuscatedName("ns.cp(I)I")
    public int method6121() {
        return this.field3780;
    }

    @ObfuscatedName("ns.cq(B)I")
    public int method6122() {
        return this.field3772;
    }

    @ObfuscatedName("ns.ci(I)I")
    public int method6098() {
        return this.field3787.method7428();
    }

    @ObfuscatedName("ns.co(I)I")
    public int method6124() {
        return this.field3774;
    }

    @ObfuscatedName("ns.cn(I)I")
    public int method6125() {
        return this.field3787.method7420();
    }

    @ObfuscatedName("ns.cy(I)Z")
    public boolean method6126() {
        return this.method6120() > 1;
    }

    @ObfuscatedName("ns.ce(B)Z")
    public boolean method6127() {
        return this.field3776 != this.field3775;
    }

    @ObfuscatedName("ns.cf(Ljava/lang/String;B)Ljava/lang/String;")
    public String method6220(String arg0) {
        StringBuilder var2 = new StringBuilder(arg0.length());
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            char var4 = arg0.charAt(var3);
            if (this.method6087(var4)) {
                var2.append(var4);
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("ns.cc(Ltj;Ltj;B)V")
    public void method6129(class519 arg0, class519 arg1) {
        if ((Integer) arg1.field5230 < (Integer) arg0.field5230) {
            this.method6084((Integer) arg0.field5228, (Integer) arg1.field5230);
        } else {
            this.method6084((Integer) arg0.field5230, (Integer) arg1.field5228);
        }
    }

    @ObfuscatedName("ns.cs(IB)Ltj;")
    public class519 method6130(int arg0) {
        int var2 = this.field3787.method7393();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.method6136(this.field3787.method7389(var5 - 1).field4748)) {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.method6136(this.field3787.method7389(var6).field4748)) {
                var4 = var6;
                break;
            }
        }
        return new class519(var3, var4);
    }

    @ObfuscatedName("ns.cw(II)Ltj;")
    public class519 method6131(int arg0) {
        int var2 = this.field3787.method7393();
        int var3 = 0;
        int var4 = var2;
        for (int var5 = arg0; var5 > 0; var5--) {
            if (this.field3787.method7389(var5 - 1).field4748 == '\n') {
                var3 = var5;
                break;
            }
        }
        for (int var6 = arg0; var6 < var2; var6++) {
            if (this.field3787.method7389(var6).field4748 == '\n') {
                var4 = var6;
                break;
            }
        }
        return new class519(var3, var4);
    }

    @ObfuscatedName("ns.ck(I)Z")
    public boolean method6281() {
        if (!this.method6263()) {
            return false;
        }
        boolean var1 = false;
        if (this.field3787.method7393() > this.field3780) {
            this.field3787.method7429(this.field3780, this.field3787.method7393());
            var1 = true;
        }
        int var2 = this.method6120();
        if (this.field3787.method7461() > var2) {
            int var3 = this.field3787.method7411(0, var2) - 1;
            this.field3787.method7429(var3, this.field3787.method7393());
            var1 = true;
        }
        if (var1) {
            int var4 = this.field3775;
            int var5 = this.field3776;
            int var6 = this.field3787.method7393();
            if (this.field3775 > var6) {
                var4 = var6;
            }
            if (this.field3776 > var6) {
                var5 = var6;
            }
            this.method6084(var5, var4);
        }
        return var1;
    }

    @ObfuscatedName("ns.ch(IZI)V")
    public void method6329(int arg0, boolean arg1) {
        if (arg1) {
            this.method6084(this.field3776, arg0);
        } else {
            this.method6084(arg0, arg0);
        }
    }

    @ObfuscatedName("ns.cv(I)I")
    public int method6134() {
        return this.field3778 / this.field3787.method7518();
    }

    @ObfuscatedName("ns.cd(B)V")
    public void method6135() {
        class438 var1 = this.field3787.method7471(0, this.field3775);
        class519 var2 = var1.method7635();
        int var3 = this.field3787.method7518();
        int var4 = (Integer) var2.field5230 - 10;
        int var5 = var4 + 20;
        int var6 = (Integer) var2.field5228 - 3;
        int var7 = var6 + 6 + var3;
        int var8 = this.field3783;
        int var9 = this.field3781 + var8;
        int var10 = this.field3759;
        int var11 = this.field3778 + var10;
        int var12 = this.field3783;
        int var13 = this.field3759;
        if (var4 < var8) {
            var12 = var4;
        } else if (var5 > var9) {
            var12 = var5 - this.field3781;
        }
        if (var6 < var10) {
            var13 = var6;
        } else if (var7 > var11) {
            var13 = var7 - this.field3778;
        }
        this.method6300(var12, var13);
    }

    @ObfuscatedName("ns.ca(II)Z")
    public boolean method6136(int arg0) {
        return arg0 == 32 || arg0 == 10 || arg0 == 9;
    }

    @ObfuscatedName("ns.dv(I)V")
    public void method6137() {
        if (this.field3785 != null) {
            this.field3785.method2727();
        }
    }

    @ObfuscatedName("ns.da(II)Z")
    public boolean method6087(int arg0) {
        switch(this.field3774) {
            case 1:
                return class417.method3182((char) arg0);
            case 2:
                return class417.method5909((char) arg0);
            case 3:
                return class417.method4709((char) arg0);
            case 4:
                char var2 = (char) arg0;
                if (class417.method4709(var2)) {
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

    @ObfuscatedName("ns.dp(I)Ltj;")
    public class519 method6139() {
        int var1 = this.field3787.method7457(this.field3781);
        int var2 = this.field3787.method7441(this.field3778);
        return new class519(var1, var2);
    }
}
