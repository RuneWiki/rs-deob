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

@ObfuscatedName("gr")
public class class173 {

    @ObfuscatedName("gr.am")
    public int field1811 = -1;

    @ObfuscatedName("gr.av")
    public String field1814;

    @ObfuscatedName("gr.ag")
    public class117 field1812;

    @ObfuscatedName("gr.aa")
    public String field1820 = null;

    @ObfuscatedName("gr.ap")
    public float[] field1815 = new float[4];

    @ObfuscatedName("gr.ay")
    public ArrayList field1816 = new ArrayList();

    @ObfuscatedName("gr.as")
    public ArrayList field1817 = new ArrayList();

    @ObfuscatedName("gr.aj")
    public ArrayList field1818 = new ArrayList();

    @ObfuscatedName("gr.an")
    public Map field1819 = new HashMap();

    @ObfuscatedName("gr.au")
    public Map field1806 = new HashMap();

    @ObfuscatedName("gr.ac(Ljava/lang/String;Len;I)Z")
    public boolean method3151(String arg0, class115 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3161();
            try {
                this.field1814 = arg0;
                this.field1812 = arg1.method2701(new URL(this.field1814));
                this.field1811 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3161();
                this.field1811 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("gr.al(Len;I)V")
    public void method3152(class115 arg0) {
        switch(this.field1811) {
            case 0:
                this.method3215(arg0);
                break;
            case 1:
                this.method3163();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gr.ak(I)I")
    public int method3185() {
        return this.field1811;
    }

    @ObfuscatedName("gr.ax(Ljava/lang/String;I)I")
    public int method3154(String arg0) {
        return this.field1819.containsKey(arg0) ? (Integer) this.field1819.get(arg0) : -1;
    }

    @ObfuscatedName("gr.ao(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3169(String arg0) {
        return (String) ((String) (this.field1806.containsKey(arg0) ? this.field1806.get(arg0) : null));
    }

    @ObfuscatedName("gr.ah(I)Ljava/util/ArrayList;")
    public ArrayList method3156() {
        return this.field1817;
    }

    @ObfuscatedName("gr.ar(I)Ljava/util/ArrayList;")
    public ArrayList method3157() {
        return this.field1818;
    }

    @ObfuscatedName("gr.ab(B)Ljava/lang/String;")
    public String method3158() {
        return this.field1820;
    }

    @ObfuscatedName("gr.am(B)[F")
    public float[] method3188() {
        return this.field1815;
    }

    @ObfuscatedName("gr.av(I)Ljava/util/ArrayList;")
    public ArrayList method3160() {
        return this.field1816;
    }

    @ObfuscatedName("gr.ag(B)V")
    public void method3161() {
        this.field1812 = null;
        this.field1820 = null;
        this.field1815[0] = 0.0F;
        this.field1815[1] = 0.0F;
        this.field1815[2] = 1.0F;
        this.field1815[3] = 1.0F;
        this.field1816.clear();
        this.field1817.clear();
        this.field1818.clear();
        this.field1819.clear();
        this.field1806.clear();
    }

    @ObfuscatedName("gr.aa(Len;S)V")
    public void method3215(class115 arg0) {
        if (this.field1812 == null || !this.field1812.method2731()) {
            return;
        }
        byte[] var2 = this.field1812.method2727();
        if (var2 == null) {
            this.method3161();
            this.field1811 = 100;
            return;
        }
        try {
            this.method3168(new class478(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3161();
            this.field1811 = 102;
            return;
        }
        this.field1811 = this.field1817.size() > 0 ? 1 : 2;
        this.field1812 = null;
    }

    @ObfuscatedName("gr.ap(B)V")
    public void method3163() {
        Iterator var1 = this.field1817.iterator();
        class179 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1817.iterator();
                while (var3.hasNext()) {
                    class179 var4 = (class179) var3.next();
                    if (var4.field1857 != null) {
                        byte[] var5 = var4.field1857.method2727();
                        if (var5 != null && var5.length > 0) {
                            this.field1811 = 2;
                            return;
                        }
                    }
                }
                this.method3161();
                this.field1811 = 101;
                return;
            }
            var2 = (class179) var1.next();
        } while (var2.field1857 == null || var2.field1857.method2731());
    }

    @ObfuscatedName("gr.ay(Lorg/json/JSONArray;Len;I)V")
    public void method3164(JSONArray arg0, class115 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class179 var5 = new class179(this);
                var5.field1857 = arg1.method2701(new URL(var4.getString("src")));
                var5.field1856 = method3565(var4, "placement");
                this.field1817.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("gr.as(Lorg/json/JSONArray;I)V")
    public void method3162(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class180 var4 = new class180(this);
            var4.field1859 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1863 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1864 = var10;
            var4.field1865 = var3.getInt("font");
            var4.field1861 = method3565(var3, "placement");
            this.field1818.add(var4);
        }
    }

    @ObfuscatedName("gr.aj(Lorg/json/JSONObject;B)V")
    public void method3165(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1815 = method3565(arg0, "clickbounds");
        this.field1820 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1816.add(new class181(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1816.add(new class181(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1816.add(new class181(this, var2[var3], 0));
                        } else {
                            this.field1816.add(new class172(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("gr.an(Lorg/json/JSONObject;I)V")
    public void method3155(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1819.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1819.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1819.put(var2[var3], 0);
                    } else {
                        this.field1806.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("gr.au(Lsi;Len;B)V")
    public void method3168(class478 arg0, class115 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7727();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3161();
            this.field1811 = 102;
            return;
        }
        try {
            this.method3164(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field1817.clear();
        }
        try {
            this.method3162(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field1818.clear();
        }
        try {
            this.method3165(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field1820 = null;
            this.field1815[0] = 0.0F;
            this.field1815[1] = 0.0F;
            this.field1815[2] = 1.0F;
            this.field1815[3] = 1.0F;
            this.field1816.clear();
        }
        try {
            this.method3155(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field1819.clear();
            this.field1806.clear();
        }
    }

    @ObfuscatedName("gr.ai(Ljava/lang/String;Len;I)Z")
    public boolean method3194(String arg0, class115 arg1) {
        try {
            this.method3168(new class478(arg0.getBytes()), arg1);
            this.field1811 = this.field1817.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field1811 = 102;
        }
        return this.field1811 < 100;
    }

    @ObfuscatedName("ie.ae(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method3565(JSONObject arg0, String arg1) throws JSONException {
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
