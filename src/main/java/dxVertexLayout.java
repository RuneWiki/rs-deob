import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class161 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field10596;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Llj;[Lpfa;)V", line = 3)
    public dxVertexLayout(class8 arg0, class249[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field112);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class249 var7 = arg1[var5];
            for (int var8 = 0; var7.method1651(3) > var8; var8++) {
                class664 var9 = var7.method1652(true, var8);
                if (class664.field9349 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class664.field9350 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class664.field9351 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class664.field9352 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class664.field9353 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class664.field9354 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class664.field9355 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field9346;
            }
        }
        var3.finish();
        this.field10596 = arg0.field100.method4172(var3, null);
    }
}
