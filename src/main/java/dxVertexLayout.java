import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class753 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "c", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4111;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lhl;[Ltg;)V", line = 3)
    public dxVertexLayout(class527 arg0, class231[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field7528);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class231 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method1338(true); var8++) {
                class467 var9 = var7.method1337((byte) 77, var8);
                if (class467.field6679 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class467.field6682 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class467.field6683 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class467.field6684 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class467.field6685 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class467.field6686 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class467.field6687 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field6678;
            }
        }
        var3.finish();
        this.field4111 = arg0.field7501.method2901(var3, null);
    }
}
