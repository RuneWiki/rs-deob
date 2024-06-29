package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/jv")
public class class709 {
   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "b",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field10668 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "c",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10669;
   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10670;

   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "a",
      descriptor = "(ILjaclib/peer/PeerReference;)V",
      line = 6
   )
   private final void method5224(int arg0, PeerReference arg1) {
      arg1.method5233((byte)118);
      if (this.field10670 == arg1) {
         this.field10670 = arg1.field10672;
      }

      if (this.field10669 == arg1) {
         this.field10669 = arg1.field10673;
      }

      if (arg0 == 12296) {
         if (arg1.field10673 != null) {
            arg1.field10673.field10672 = arg1.field10672;
         }

         if (arg1.field10672 != null) {
            arg1.field10672.field10673 = arg1.field10673;
         }

      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "a",
      descriptor = "(B)V",
      line = 32
   )
   public final void method5225(byte arg0) {
      if (arg0 != -5) {
         this.method5227(-42, (PeerReference)null);
      }

      this.method5226(arg0 ^ -209);
   }

   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "a",
      descriptor = "(I)V",
      line = 42
   )
   private final void method5226(int arg0) {
      if (arg0 != 212) {
         this.field10668 = (ReferenceQueue)null;
      }

      while(true) {
         Reference var2 = this.field10668.poll();
         if (var2 == null) {
            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method5224(arg0 + 12084, var3);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "b",
      descriptor = "(ILjaclib/peer/PeerReference;)V",
      line = 65
   )
   public final void method5227(int arg0, PeerReference arg1) {
      arg1.field10673 = null;
      arg1.field10672 = this.field10670;
      if (this.field10669 != null) {
         this.field10670.field10673 = arg1;
      } else {
         this.field10669 = arg1;
      }

      if (arg0 == 13109) {
         this.field10670 = arg1;
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/jv",
      name = "b",
      descriptor = "(B)V",
      line = 83
   )
   public final void method5228(byte arg0) {
      this.method5226(arg0 ^ -212);

      while(this.field10670 != null) {
         this.method5224(12296, this.field10670);
      }

      if (arg0 != -8) {
         this.method5228((byte)1);
      }

      this.method5226(arg0 + 220);
   }
}
