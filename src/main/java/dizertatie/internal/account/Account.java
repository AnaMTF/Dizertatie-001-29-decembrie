package dizertatie.internal.account;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_ACCOUNTS")
public class Account {
	@Id
	@Column(name = "ACCOUNT_UUID")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uuid;

	@Column(name = "ACCOUNT_FIRST_NAME")
	private String firstName;

	@Column(name = "ACCOUNT_LAST_NAME")
	private String lastName;

	@Enumerated(EnumType.STRING)
	@Column(name = "ACCOUNT_TYPE", nullable = false)
	private AccountType accountType;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "T_PATIENT_DOCTORS",
			joinColumns = @JoinColumn(name = "PATIENT_UUID"),
			inverseJoinColumns = @JoinColumn(name = "DOCTOR_UUID"))
	private Set<Account> doctors = new HashSet<Account>();

	@ManyToMany(mappedBy = "doctors", fetch = FetchType.LAZY)
	private Set<Account> patients = new HashSet<Account>();
	
	public Account(String firstName, String lastName, AccountType accountType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = accountType;
	}

	protected Account() {
		super();
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public AccountType getRole() {
		return accountType;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRole(AccountType role) {
		this.accountType = role;
	}
}
