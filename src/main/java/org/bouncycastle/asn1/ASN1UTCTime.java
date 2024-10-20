package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class ASN1UTCTime extends ASN1Primitive {

    public byte[] time;

    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1UTCTime) ? getInstance(var2) : new ASN1UTCTime(((ASN1OctetString) var2).getOctets());
    }

    public boolean isConstructed() {
        return false;
    }

    public ASN1UTCTime(Date arg0) {
        SimpleDateFormat var2 = new SimpleDateFormat("yyMMddHHmmss'Z'");
        var2.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(var2.format(arg0));
    }

    public String ahk() {
        return Strings.fromByteArray(this.time);
    }

    public ASN1UTCTime(byte[] arg0) {
        this.time = arg0;
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat var1 = new SimpleDateFormat("yyMMddHHmmssz");
        return var1.parse(this.getTime());
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat var1 = new SimpleDateFormat("yyyyMMddHHmmssz");
        var1.setTimeZone(new SimpleTimeZone(0, "Z"));
        return var1.parse(this.getAdjustedTime());
    }

    public String getTime() {
        String var1 = Strings.fromByteArray(this.time);
        if (var1.indexOf(45) < 0 && var1.indexOf(43) < 0) {
            return var1.length() == 11 ? var1.substring(0, 10) + "00GMT+00:00" : var1.substring(0, 12) + "GMT+00:00";
        }
        int var2 = var1.indexOf(45);
        if (var2 < 0) {
            var2 = var1.indexOf(43);
        }
        String var3 = var1;
        if (var2 == var1.length() - 3) {
            var3 = var1 + "00";
        }
        return var2 == 10 ? var3.substring(0, 10) + "00GMT" + var3.substring(10, 13) + ":" + var3.substring(13, 15) : var3.substring(0, 12) + "GMT" + var3.substring(12, 15) + ":" + var3.substring(15, 17);
    }

    public String getAdjustedTime() {
        String var1 = this.getTime();
        return var1.charAt(0) < '5' ? "20" + var1 : "19" + var1;
    }

    public static ASN1UTCTime getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (ASN1UTCTime) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public int encodedLength() {
        int var1 = this.time.length;
        return 1 + StreamUtil.calculateBodyLength(var1) + var1;
    }

    public String ahb() {
        return Strings.fromByteArray(this.time);
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.write(23);
        int var2 = this.time.length;
        arg0.writeLength(var2);
        for (int var3 = 0; var3 != var2; var3++) {
            arg0.write(this.time[var3]);
        }
    }

    public String ahc() {
        return Strings.fromByteArray(this.time);
    }

    public String toString() {
        return Strings.fromByteArray(this.time);
    }

    public int ahf() {
        return Arrays.hashCode(this.time);
    }

    public int ahi() {
        return Arrays.hashCode(this.time);
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        return (arg0 instanceof ASN1UTCTime) ? Arrays.areEqual(this.time, ((ASN1UTCTime) arg0).time) : false;
    }

    public ASN1UTCTime(String arg0) {
        this.time = Strings.toByteArray(arg0);
        try {
            this.getDate();
        } catch (ParseException var3) {
            throw new IllegalArgumentException("invalid date string: " + var3.getMessage());
        }
    }

    public ASN1UTCTime(Date arg0, Locale arg1) {
        SimpleDateFormat var3 = new SimpleDateFormat("yyMMddHHmmss'Z'", arg1);
        var3.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(var3.format(arg0));
    }
}
