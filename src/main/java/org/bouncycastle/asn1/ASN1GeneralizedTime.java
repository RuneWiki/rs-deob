package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class ASN1GeneralizedTime extends ASN1Primitive {

    public byte[] time;

    public boolean asn1Equals(ASN1Primitive arg0) {
        return (arg0 instanceof ASN1GeneralizedTime) ? Arrays.areEqual(this.time, ((ASN1GeneralizedTime) arg0).time) : false;
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1GeneralizedTime) ? getInstance(var2) : new ASN1GeneralizedTime(((ASN1OctetString) var2).getOctets());
    }

    public ASN1GeneralizedTime(String arg0) {
        this.time = Strings.toByteArray(arg0);
        try {
            this.getDate();
        } catch (ParseException var3) {
            throw new IllegalArgumentException("invalid date string: " + var3.getMessage());
        }
    }

    public ASN1GeneralizedTime(Date arg0) {
        SimpleDateFormat var2 = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        var2.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(var2.format(arg0));
    }

    public ASN1GeneralizedTime(Date arg0, Locale arg1) {
        SimpleDateFormat var3 = new SimpleDateFormat("yyyyMMddHHmmss'Z'", arg1);
        var3.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(var3.format(arg0));
    }

    public int ahi() {
        return Arrays.hashCode(this.time);
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.time);
    }

    public ASN1GeneralizedTime(byte[] arg0) {
        this.time = arg0;
    }

    public String calculateGMTOffset() {
        String var1 = "+";
        TimeZone var2 = TimeZone.getDefault();
        int var3 = var2.getRawOffset();
        if (var3 < 0) {
            var1 = "-";
            var3 = -var3;
        }
        int var4 = var3 / 3600000;
        int var5 = (var3 - var4 * 60 * 60 * 1000) / 60000;
        try {
            if (var2.useDaylightTime() && var2.inDaylightTime(this.getDate())) {
                var4 += var1.equals("+") ? 1 : -1;
            }
        } catch (ParseException var7) {
        }
        return "GMT" + var1 + this.convert(var4) + ":" + this.convert(var5);
    }

    public boolean isConstructed() {
        return false;
    }

    public Date getDate() throws ParseException {
        String var1 = Strings.fromByteArray(this.time);
        String var2 = var1;
        SimpleDateFormat var3;
        if (var1.endsWith("Z")) {
            if (this.hasFractionalSeconds()) {
                var3 = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else {
                var3 = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            }
            var3.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (var1.indexOf(45) <= 0 && var1.indexOf(43) <= 0) {
            if (this.hasFractionalSeconds()) {
                var3 = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else {
                var3 = new SimpleDateFormat("yyyyMMddHHmmss");
            }
            var3.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        } else {
            var2 = this.getTime();
            if (this.hasFractionalSeconds()) {
                var3 = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            } else {
                var3 = new SimpleDateFormat("yyyyMMddHHmmssz");
            }
            var3.setTimeZone(new SimpleTimeZone(0, "Z"));
        }
        if (this.hasFractionalSeconds()) {
            String var4 = var2.substring(14);
            int var5;
            for (var5 = 1; var5 < var4.length(); var5++) {
                char var6 = var4.charAt(var5);
                if ('0' > var6 || var6 > '9') {
                    break;
                }
            }
            if (var5 - 1 > 3) {
                String var7 = var4.substring(0, 4) + var4.substring(var5);
                var2 = var2.substring(0, 14) + var7;
            } else if (var5 - 1 == 1) {
                String var8 = var4.substring(0, var5) + "00" + var4.substring(var5);
                var2 = var2.substring(0, 14) + var8;
            } else if (var5 - 1 == 2) {
                String var9 = var4.substring(0, var5) + "0" + var4.substring(var5);
                var2 = var2.substring(0, 14) + var9;
            }
        }
        return var3.parse(var2);
    }

    public boolean hasFractionalSeconds() {
        for (int var1 = 0; var1 != this.time.length; var1++) {
            if (this.time[var1] == 46 && var1 == 14) {
                return true;
            }
        }
        return false;
    }

    public static ASN1GeneralizedTime getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (ASN1GeneralizedTime) fromByteArray((byte[]) ((byte[]) arg0));
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

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(24, this.time);
    }

    public String getTime() {
        String var1 = Strings.fromByteArray(this.time);
        if (var1.charAt(var1.length() - 1) == 'Z') {
            return var1.substring(0, var1.length() - 1) + "GMT+00:00";
        }
        int var2 = var1.length() - 5;
        char var3 = var1.charAt(var2);
        if (var3 == '-' || var3 == '+') {
            return var1.substring(0, var2) + "GMT" + var1.substring(var2, var2 + 3) + ":" + var1.substring(var2 + 3);
        } else {
            int var4 = var1.length() - 3;
            char var5 = var1.charAt(var4);
            return var5 == '-' || var5 == '+' ? var1.substring(0, var4) + "GMT" + var1.substring(var4) + ":00" : var1 + this.calculateGMTOffset();
        }
    }

    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    public int ahf() {
        return Arrays.hashCode(this.time);
    }

    public String convert(int arg0) {
        return arg0 < 10 ? "0" + arg0 : Integer.toString(arg0);
    }
}
