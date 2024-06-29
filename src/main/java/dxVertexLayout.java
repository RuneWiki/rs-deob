import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class358 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field3806;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lrca;[Lck;)V", line = 3)
    public dxVertexLayout(class391 arg0, class558[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field5988);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class558 var7 = arg1[var5];
            for (int var8 = 0; var7.method3237(0) > var8; var8++) {
                class596 var9 = var7.method3235(var8, (byte) -26);
                byte var10;
                byte var11;
                int var12;
                if (class596.field8705 == var9) {
                    var12 = 0;
                    var11 = 2;
                    var10 = 0;
                } else if (class596.field8706 == var9) {
                    var10 = 3;
                    var11 = 2;
                    var12 = 0;
                } else if (class596.field8707 == var9) {
                    var11 = 4;
                    var12 = 0;
                    var10 = 10;
                } else if (class596.field8708 == var9) {
                    var10 = 5;
                    var12 = var4++;
                    var11 = 0;
                } else if (class596.field8709 == var9) {
                    var11 = 1;
                    var10 = 5;
                    var12 = var4++;
                } else if (class596.field8710 == var9) {
                    var12 = var4++;
                    var10 = 5;
                    var11 = 2;
                } else {
                    var12 = var4++;
                    var11 = 3;
                    var10 = 5;
                }
                var3.addElement(var5, var11, 0, var10, var12, var6);
                var6 += var9.field8700;
            }
        }
        var3.finish();
        this.field3806 = arg0.field5990.method2620(var3, null);
    }
}
