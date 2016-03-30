// Hibernate2_Category.java example
// POJO Class - Uses Annotation Code

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "category", catalog = "stockdb")
public class Hibernate2_Category implements java.io.Serializable {

	private Integer categoryId;
	private String name;
	private String desc;
	private Set<Hibernate2_Stock> stocks = new HashSet<Hibernate2_Stock>(0);

	public Hibernate2_Category() {
	}

	public Hibernate2_Category(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public Hibernate2_Category(String name, String desc, Set<Hibernate2_Stock> stocks) {
		this.name = name;
		this.desc = desc;
		this.stocks = stocks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "NAME", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "[DESC]", nullable = false)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Hibernate2_Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(Set<Hibernate2_Stock> stocks) {
		this.stocks = stocks;
	}

}