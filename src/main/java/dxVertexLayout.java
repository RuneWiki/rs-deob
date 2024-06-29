import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class618 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "k", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4756;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lta;[Lwk;)V")
    public dxVertexLayout(class224 arg0, class152[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3446);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class152 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1049(false); var8++) {
                class631 var9 = var7.method1044(var8, (byte) 97);
                if (class631.field8865 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class631.field8867 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class631.field8868 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class631.field8869 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class631.field8870 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class631.field8871 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class631.field8872 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field8864;
            }
        }
        var3.finish();
        this.field4756 = arg0.field3450.method3071(var3, null);
    }
}
