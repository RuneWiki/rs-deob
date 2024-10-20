package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ft")
public class class163 {

    @ObfuscatedName("ft.n")
    public int field1770 = -1;

    @ObfuscatedName("ft.r")
    public String field1778;

    @ObfuscatedName("ft.l")
    public class110 field1772;

    @ObfuscatedName("ft.s")
    public String field1774 = null;

    @ObfuscatedName("ft.p")
    public float[] field1777 = new float[4];

    @ObfuscatedName("ft.b")
    public ArrayList field1775 = new ArrayList();

    @ObfuscatedName("ft.o")
    public ArrayList field1776 = new ArrayList();

    @ObfuscatedName("ft.u")
    public ArrayList field1771 = new ArrayList();

    @ObfuscatedName("ft.z")
    public Map field1773 = new HashMap();

    @ObfuscatedName("ft.t")
    public Map field1767 = new HashMap();

    @ObfuscatedName("ft.a(Ljava/lang/String;Ldk;I)Z")
    public boolean method2997(String arg0, class108 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3033();
            try {
                this.field1778 = arg0;
                this.field1772 = arg1.method2565(new URL(this.field1778));
                this.field1770 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3033();
                this.field1770 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("ft.f(Ldk;I)V")
    public void method2998(class108 arg0) {
        switch(this.field1770) {
            case 0:
                this.method2996(arg0);
                break;
            case 1:
                this.method3007();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("ft.c(B)I")
    public int method3036() {
        return this.field1770;
    }

    @ObfuscatedName("ft.x(Ljava/lang/String;B)I")
    public int method3000(String arg0) {
        return this.field1773.containsKey(arg0) ? (Integer) this.field1773.get(arg0) : -1;
    }

    @ObfuscatedName("ft.h(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3001(String arg0) {
        return (String) ((String) (this.field1767.containsKey(arg0) ? this.field1767.get(arg0) : null));
    }

    @ObfuscatedName("ft.j(I)Ljava/util/ArrayList;")
    public ArrayList method3002() {
        return this.field1776;
    }

    @ObfuscatedName("ft.y(B)Ljava/util/ArrayList;")
    public ArrayList method3051() {
        return this.field1771;
    }

    @ObfuscatedName("ft.d(I)Ljava/lang/String;")
    public String method3004() {
        return this.field1774;
    }

    @ObfuscatedName("ft.n(I)Ljava/util/ArrayList;")
    public ArrayList method3005() {
        return this.field1775;
    }

    @ObfuscatedName("ft.r(I)V")
    public void method3033() {
        this.field1772 = null;
        this.field1774 = null;
        this.field1777[0] = 0.0F;
        this.field1777[1] = 0.0F;
        this.field1777[2] = 1.0F;
        this.field1777[3] = 1.0F;
        this.field1775.clear();
        this.field1776.clear();
        this.field1771.clear();
        this.field1773.clear();
        this.field1767.clear();
    }

    @ObfuscatedName("ft.l(Ldk;I)V")
    public void method2996(class108 arg0) {
        if (this.field1772 == null || !this.field1772.method2596()) {
            return;
        }
        byte[] var2 = this.field1772.method2609();
        if (var2 == null) {
            this.method3033();
            this.field1770 = 100;
            return;
        }
        JSONObject var5;
        try {
            class420 var3 = new class420(var2);
            JSONObject var4 = var3.method7140();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method3033();
            this.field1770 = 102;
            return;
        }
        try {
            this.method3008(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1776.clear();
        }
        try {
            this.method3020(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1771.clear();
        }
        try {
            this.method2999(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1774 = null;
            this.field1777[0] = 0.0F;
            this.field1777[1] = 0.0F;
            this.field1777[2] = 1.0F;
            this.field1777[3] = 1.0F;
            this.field1775.clear();
        }
        try {
            this.method3006(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1773.clear();
            this.field1767.clear();
        }
        this.field1770 = this.field1776.size() > 0 ? 1 : 2;
        this.field1772 = null;
    }

    @ObfuscatedName("ft.s(I)V")
    public void method3007() {
        Iterator var1 = this.field1776.iterator();
        class168 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1776.iterator();
                while (var3.hasNext()) {
                    class168 var4 = (class168) var3.next();
                    if (var4.field1816 != null) {
                        byte[] var5 = var4.field1816.method2609();
                        if (var5 != null && var5.length > 0) {
                            this.field1770 = 2;
                            return;
                        }
                    }
                }
                this.method3033();
                this.field1770 = 101;
                return;
            }
            var2 = (class168) var1.next();
        } while (var2.field1816 == null || var2.field1816.method2596());
    }

    @ObfuscatedName("ft.p(Lorg/json/JSONArray;Ldk;B)V")
    public void method3008(JSONArray arg0, class108 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class168 var5 = new class168(this);
                var5.field1816 = arg1.method2565(new URL(var4.getString("src")));
                var5.field1815 = method2794(var4, "placement");
                this.field1776.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("ft.b(Lorg/json/JSONArray;I)V")
    public void method3020(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class169 var4 = new class169(this);
            var4.field1819 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1821 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1822 = var10;
            var4.field1823 = var3.getInt("font");
            var4.field1817 = method2794(var3, "placement");
            this.field1771.add(var4);
        }
    }

    @ObfuscatedName("ft.o(Lorg/json/JSONObject;B)V")
    public void method2999(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1777 = method2794(arg0, "clickbounds");
        this.field1774 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1775.add(new class170(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1775.add(new class170(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1775.add(new class170(this, var2[var3], 0));
                        } else {
                            this.field1775.add(new class162(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("ft.u(Lorg/json/JSONObject;I)V")
    public void method3006(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1773.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1773.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1773.put(var2[var3], 0);
                    } else {
                        this.field1767.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("dz.z(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method2794(JSONObject arg0, String arg1) throws JSONException {
        float[] var2 = new float[4];
        try {
            JSONArray var3 = arg0.getJSONArray(arg1);
            var2[0] = (float) var3.optDouble(0, 0.0D);
            var2[1] = (float) var3.optDouble(1, 0.0D);
            var2[2] = (float) var3.optDouble(2, 1.0D);
            var2[3] = (float) var3.optDouble(3, 1.0D);
        } catch (JSONException var5) {
            var2[0] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 1.0F;
            var2[3] = 1.0F;
        }
        return var2;
    }
}
