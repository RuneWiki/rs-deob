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

@ObfuscatedName("gi")
public class class170 {

    @ObfuscatedName("gi.ae")
    public int field1803 = -1;

    @ObfuscatedName("gi.af")
    public String field1804;

    @ObfuscatedName("gi.ao")
    public class114 field1802;

    @ObfuscatedName("gi.aa")
    public String field1806 = null;

    @ObfuscatedName("gi.aj")
    public float[] field1807 = new float[4];

    @ObfuscatedName("gi.ad")
    public ArrayList field1800 = new ArrayList();

    @ObfuscatedName("gi.ac")
    public ArrayList field1813 = new ArrayList();

    @ObfuscatedName("gi.ag")
    public ArrayList field1810 = new ArrayList();

    @ObfuscatedName("gi.ar")
    public Map field1811 = new HashMap();

    @ObfuscatedName("gi.ah")
    public Map field1812 = new HashMap();

    @ObfuscatedName("gi.at(Ljava/lang/String;Lea;S)Z")
    public boolean method3114(String arg0, class112 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3124();
            try {
                this.field1804 = arg0;
                this.field1802 = arg1.method2663(new URL(this.field1804));
                this.field1803 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3124();
                this.field1803 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("gi.an(Lea;B)V")
    public void method3128(class112 arg0) {
        switch(this.field1803) {
            case 0:
                this.method3140(arg0);
                break;
            case 1:
                this.method3126();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gi.av(B)I")
    public int method3116() {
        return this.field1803;
    }

    @ObfuscatedName("gi.as(Ljava/lang/String;I)I")
    public int method3117(String arg0) {
        return this.field1811.containsKey(arg0) ? (Integer) this.field1811.get(arg0) : -1;
    }

    @ObfuscatedName("gi.ax(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3172(String arg0) {
        return (String) ((String) (this.field1812.containsKey(arg0) ? this.field1812.get(arg0) : null));
    }

    @ObfuscatedName("gi.ap(I)Ljava/util/ArrayList;")
    public ArrayList method3119() {
        return this.field1813;
    }

    @ObfuscatedName("gi.ab(I)Ljava/util/ArrayList;")
    public ArrayList method3120() {
        return this.field1810;
    }

    @ObfuscatedName("gi.ak(B)Ljava/lang/String;")
    public String method3121() {
        return this.field1806;
    }

    @ObfuscatedName("gi.ae(B)[F")
    public float[] method3122() {
        return this.field1807;
    }

    @ObfuscatedName("gi.af(I)Ljava/util/ArrayList;")
    public ArrayList method3155() {
        return this.field1800;
    }

    @ObfuscatedName("gi.ao(I)V")
    public void method3124() {
        this.field1802 = null;
        this.field1806 = null;
        this.field1807[0] = 0.0F;
        this.field1807[1] = 0.0F;
        this.field1807[2] = 1.0F;
        this.field1807[3] = 1.0F;
        this.field1800.clear();
        this.field1813.clear();
        this.field1810.clear();
        this.field1811.clear();
        this.field1812.clear();
    }

    @ObfuscatedName("gi.aa(Lea;I)V")
    public void method3140(class112 arg0) {
        if (this.field1802 == null || !this.field1802.method2687()) {
            return;
        }
        byte[] var2 = this.field1802.method2688();
        if (var2 == null) {
            this.method3124();
            this.field1803 = 100;
            return;
        }
        try {
            this.method3131(new class451(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3124();
            this.field1803 = 102;
            return;
        }
        this.field1803 = this.field1813.size() > 0 ? 1 : 2;
        this.field1802 = null;
    }

    @ObfuscatedName("gi.aj(I)V")
    public void method3126() {
        Iterator var1 = this.field1813.iterator();
        class176 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1813.iterator();
                while (var3.hasNext()) {
                    class176 var4 = (class176) var3.next();
                    if (var4.field1845 != null) {
                        byte[] var5 = var4.field1845.method2688();
                        if (var5 != null && var5.length > 0) {
                            this.field1803 = 2;
                            return;
                        }
                    }
                }
                this.method3124();
                this.field1803 = 101;
                return;
            }
            var2 = (class176) var1.next();
        } while (var2.field1845 == null || var2.field1845.method2687());
    }

    @ObfuscatedName("gi.ad(Lorg/json/JSONArray;Lea;B)V")
    public void method3148(JSONArray arg0, class112 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class176 var5 = new class176(this);
                var5.field1845 = arg1.method2663(new URL(var4.getString("src")));
                var5.field1842 = method3502(var4, "placement");
                this.field1813.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("gi.ac(Lorg/json/JSONArray;B)V")
    public void method3113(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class177 var4 = new class177(this);
            var4.field1849 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1851 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1846 = var10;
            var4.field1853 = var3.getInt("font");
            var4.field1850 = method3502(var3, "placement");
            this.field1810.add(var4);
        }
    }

    @ObfuscatedName("gi.ag(Lorg/json/JSONObject;B)V")
    public void method3129(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1807 = method3502(arg0, "clickbounds");
        this.field1806 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1800.add(new class178(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1800.add(new class178(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1800.add(new class178(this, var2[var3], 0));
                        } else {
                            this.field1800.add(new class169(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("gi.ar(Lorg/json/JSONObject;B)V")
    public void method3138(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1811.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1811.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1811.put(var2[var3], 0);
                    } else {
                        this.field1812.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("gi.ah(Lrr;Lea;B)V")
    public void method3131(class451 arg0, class112 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7529();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3124();
            this.field1803 = 102;
            return;
        }
        try {
            this.method3148(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field1813.clear();
        }
        try {
            this.method3113(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field1810.clear();
        }
        try {
            this.method3129(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field1806 = null;
            this.field1807[0] = 0.0F;
            this.field1807[1] = 0.0F;
            this.field1807[2] = 1.0F;
            this.field1807[3] = 1.0F;
            this.field1800.clear();
        }
        try {
            this.method3138(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field1811.clear();
            this.field1812.clear();
        }
    }

    @ObfuscatedName("gi.az(Ljava/lang/String;Lea;I)Z")
    public boolean method3163(String arg0, class112 arg1) {
        try {
            this.method3131(new class451(arg0.getBytes()), arg1);
            this.field1803 = this.field1813.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field1803 = 102;
        }
        return this.field1803 < 100;
    }

    @ObfuscatedName("hj.au(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method3502(JSONObject arg0, String arg1) throws JSONException {
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
