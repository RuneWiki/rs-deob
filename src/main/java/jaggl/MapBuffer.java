package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {
   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "c",
      descriptor = "I"
   )
   private int field9491;

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "b",
      descriptor = "()Z",
      line = 4
   )
   public final boolean method4694() {
      boolean var1 = true;
      if (~this.field9491 != -1) {
         var1 = OpenGL.glUnmapBufferARB(this.field9491);
         this.method5099(0L, 0);
         this.field9491 = 0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "(III)Z",
      line = 22
   )
   public final boolean method4695(int arg0, int arg1, int arg2) {
      if (~this.field9491 != -1) {
         return false;
      } else {
         long var4 = OpenGL.glMapBufferARB(arg0, arg2);
         if (~var4 == -1L) {
            return false;
         } else {
            this.method5099(var4, arg1);
            this.field9491 = arg0;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "()Z",
      line = 40
   )
   public final boolean method4696() {
      return ~this.field9491 != -1;
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 47
   )
   public final void method3792(byte[] arg0, int arg1, int arg2, int arg3) {
      if (this.field9491 == 0) {
         throw new RuntimeException();
      } else {
         super.method3792(arg0, arg1, arg2, arg3);
      }
   }
}
