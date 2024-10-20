package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gq")
public class class171 {

    @ObfuscatedName("gq.av")
    public int field1809 = -1;

    @ObfuscatedName("gq.ap")
    public String field1818;

    @ObfuscatedName("gq.aq")
    public class115 field1806;

    @ObfuscatedName("gq.at")
    public String field1812 = null;

    @ObfuscatedName("gq.ah")
    public float[] field1813 = new float[4];

    @ObfuscatedName("gq.ax")
    public ArrayList field1814 = new ArrayList();

    @ObfuscatedName("gq.aa")
    public ArrayList field1805 = new ArrayList();

    @ObfuscatedName("gq.au")
    public ArrayList field1816 = new ArrayList();

    @ObfuscatedName("gq.ae")
    public Map field1817 = new HashMap();

    @ObfuscatedName("gq.ab")
    public Map field1815 = new HashMap();

    @ObfuscatedName("gq.aw(Ljava/lang/String;Lej;B)Z")
    public boolean method3131(String arg0, class113 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3141();
            try {
                this.field1818 = arg0;
                this.field1806 = arg1.method2686(new URL(this.field1818));
                this.field1809 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3141();
                this.field1809 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("gq.ay(Lej;B)V")
    public void method3172(class113 arg0) {
        switch(this.field1809) {
            case 0:
                this.method3142(arg0);
                break;
            case 1:
                this.method3146();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gq.ar(I)I")
    public int method3138() {
        return this.field1809;
    }

    @ObfuscatedName("gq.am(Ljava/lang/String;I)I")
    public int method3134(String arg0) {
        return this.field1817.containsKey(arg0) ? (Integer) this.field1817.get(arg0) : -1;
    }

    @ObfuscatedName("gq.as(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3135(String arg0) {
        return (String) ((String) (this.field1815.containsKey(arg0) ? this.field1815.get(arg0) : null));
    }

    @ObfuscatedName("gq.aj(I)Ljava/util/ArrayList;")
    public ArrayList method3136() {
        return this.field1805;
    }

    @ObfuscatedName("gq.ag(B)Ljava/util/ArrayList;")
    public ArrayList method3137() {
        return this.field1816;
    }

    @ObfuscatedName("gq.az(B)Ljava/lang/String;")
    public String method3179() {
        return this.field1812;
    }

    @ObfuscatedName("gq.av(I)[F")
    public float[] method3139() {
        return this.field1813;
    }

    @ObfuscatedName("gq.ap(B)Ljava/util/ArrayList;")
    public ArrayList method3187() {
        return this.field1814;
    }

    @ObfuscatedName("gq.aq(S)V")
    public void method3141() {
        this.field1806 = null;
        this.field1812 = null;
        this.field1813[0] = 0.0F;
        this.field1813[1] = 0.0F;
        this.field1813[2] = 1.0F;
        this.field1813[3] = 1.0F;
        this.field1814.clear();
        this.field1805.clear();
        this.field1816.clear();
        this.field1817.clear();
        this.field1815.clear();
    }

    @ObfuscatedName("gq.at(Lej;B)V")
    public void method3142(class113 arg0) {
        if (this.field1806 == null || !this.field1806.method2711()) {
            return;
        }
        byte[] var2 = this.field1806.method2710();
        if (var2 == null) {
            this.method3141();
            this.field1809 = 100;
            return;
        }
        try {
            this.method3148(new class464(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3141();
            this.field1809 = 102;
            return;
        }
        this.field1809 = this.field1805.size() > 0 ? 1 : 2;
        this.field1806 = null;
    }

    @ObfuscatedName("gq.ah(I)V")
    public void method3146() {
        Iterator var1 = this.field1805.iterator();
        class177 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1805.iterator();
                while (var3.hasNext()) {
                    class177 var4 = (class177) var3.next();
                    if (var4.field1854 != null) {
                        byte[] var5 = var4.field1854.method2710();
                        if (var5 != null && var5.length > 0) {
                            this.field1809 = 2;
                            return;
                        }
                    }
                }
                this.method3141();
                this.field1809 = 101;
                return;
            }
            var2 = (class177) var1.next();
        } while (var2.field1854 == null || var2.field1854.method2711());
    }

    @ObfuscatedName("gq.ax(Lorg/json/JSONArray;Lej;I)V")
    public void method3157(JSONArray arg0, class113 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class177 var5 = new class177(this);
                var5.field1854 = arg1.method2686(new URL(var4.getString("src")));
                var5.field1850 = method2561(var4, "placement");
                this.field1805.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("gq.aa(Lorg/json/JSONArray;I)V")
    public void method3190(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class178 var4 = new class178(this);
            var4.field1862 = var3.getString("text");
            var4.field1860 = method415(var3.getString("align_x"));
            var4.field1861 = method415(var3.getString("align_y"));
            var4.field1856 = var3.getInt("font");
            var4.field1859 = method2561(var3, "placement");
            this.field1816.add(var4);
        }
    }

    @ObfuscatedName("gq.au(Lorg/json/JSONObject;S)V")
    public void method3140(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1813 = method2561(arg0, "clickbounds");
        this.field1812 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1814.add(new class179(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1814.add(new class179(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1814.add(new class179(this, var2[var3], 0));
                        } else {
                            this.field1814.add(new class170(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("gq.ae(Lorg/json/JSONObject;I)V")
    public void method3147(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1817.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1817.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1817.put(var2[var3], 0);
                    } else {
                        this.field1815.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("gq.ab(Lre;Lej;B)V")
    public void method3148(class464 arg0, class113 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7628();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3141();
            this.field1809 = 102;
            return;
        }
        try {
            this.method3157(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field1805.clear();
        }
        try {
            this.method3190(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field1816.clear();
        }
        try {
            this.method3140(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field1812 = null;
            this.field1813[0] = 0.0F;
            this.field1813[1] = 0.0F;
            this.field1813[2] = 1.0F;
            this.field1813[3] = 1.0F;
            this.field1814.clear();
        }
        try {
            this.method3147(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field1817.clear();
            this.field1815.clear();
        }
    }

    @ObfuscatedName("gq.ad(Ljava/lang/String;Lej;B)Z")
    public boolean method3149(String arg0, class113 arg1) {
        try {
            this.method3148(new class464(arg0.getBytes()), arg1);
            this.field1809 = this.field1805.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field1809 = 102;
        }
        return this.field1809 < 100;
    }

    @ObfuscatedName("ec.ao(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method2561(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("bb.ac(Ljava/lang/String;B)I")
    public static int method415(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
