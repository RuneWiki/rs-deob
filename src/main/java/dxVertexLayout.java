import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class313 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field8589;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lhb;[Lbl;)V")
    public dxVertexLayout(class585 arg0, class468[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8271);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class468 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2864(57); var8++) {
                class531 var9 = var7.method2863((byte) -119, var8);
                if (class531.field7629 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class531.field7634 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class531.field7635 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class531.field7636 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class531.field7637 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class531.field7638 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class531.field7639 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field7631;
            }
        }
        var3.finish();
        this.field8589 = arg0.field8281.method4124(var3, null);
    }
}
