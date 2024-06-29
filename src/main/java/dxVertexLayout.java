import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class428 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "i",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field11217;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Lub;[Lkm;)V"
   )
   public dxVertexLayout(class165 arg0, class207[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field2106);
      int var4 = 0;

      for(int var5 = 0; ~var5 > ~arg1.length; ++var5) {
         int var6 = 0;
         class207 var7 = arg1[var5];

         for(int var8 = 0; ~var7.method1705((byte)119) < ~var8; ++var8) {
            class279 var9 = var7.method1707(var8, (byte)-52);
            if (class279.field3558 != var9) {
               if (class279.field3562 != var9) {
                  if (class279.field3563 == var9) {
                     var3.addElement(var5, 4, 0, 10, 0, var6);
                  } else if (class279.field3564 == var9) {
                     var3.addElement(var5, 0, 0, 5, var4++, var6);
                  } else if (class279.field3565 != var9) {
                     if (class279.field3566 != var9) {
                        if (class279.field3567 == var9) {
                           var3.addElement(var5, 3, 0, 5, var4++, var6);
                        }
                     } else {
                        var3.addElement(var5, 2, 0, 5, var4++, var6);
                     }
                  } else {
                     var3.addElement(var5, 1, 0, 5, var4++, var6);
                  }
               } else {
                  var3.addElement(var5, 2, 0, 3, 0, var6);
               }
            } else {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            }

            var6 += var9.field3555;
         }
      }

      var3.finish();
      this.field11217 = arg0.field2093.method5501(var3, (IDirect3DVertexDeclaration)null);
   }
}
