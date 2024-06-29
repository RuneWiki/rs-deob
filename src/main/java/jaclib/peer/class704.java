package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/go")
public class class704 {
   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "a",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field10234 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10233;
   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "c",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10235;

   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method5124(int arg0) {
      while(true) {
         Reference var2 = this.field10234.poll();
         if (var2 == null) {
            if (arg0 != -31250) {
               this.method5125(-52);
            }

            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method5126(var3, -25775);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5125(int arg0) {
      this.method5124(-31250);

      while(this.field10235 != null) {
         this.method5126(this.field10235, arg0 ^ -24280);
      }

      if (arg0 == 14969) {
         this.method5124(-31250);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "a",
      descriptor = "(Ljaclib/peer/PeerReference;I)V"
   )
   private final void method5126(PeerReference arg0, int arg1) {
      arg0.method5121((byte)80);
      if (this.field10233 == arg0) {
         this.field10233 = arg0.field10232;
      }

      if (this.field10235 == arg0) {
         this.field10235 = arg0.field10231;
      }

      if (arg0.field10232 != null) {
         arg0.field10232.field10231 = arg0.field10231;
      }

      if (arg0.field10231 != null) {
         arg0.field10231.field10232 = arg0.field10232;
      }

      if (arg1 != -25775) {
         this.method5125(113);
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5127(byte arg0) {
      this.method5124(-31250);
      if (arg0 >= -48) {
         this.field10235 = (PeerReference)null;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/go",
      name = "a",
      descriptor = "(ILjaclib/peer/PeerReference;)V"
   )
   public final void method5128(int arg0, PeerReference arg1) {
      if (arg0 != -28460) {
         this.method5125(-124);
      }

      arg1.field10232 = null;
      arg1.field10231 = this.field10235;
      if (this.field10233 != null) {
         this.field10235.field10232 = arg1;
      } else {
         this.field10233 = arg1;
      }

      this.field10235 = arg1;
   }
}
